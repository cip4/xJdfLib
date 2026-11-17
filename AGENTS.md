# AGENTS.md

Guidance for AI coding agents working on xJdfLib, the CIP4 Java library for generating and parsing XJDF/XJMF documents.

## Project facts

- Java 21 toolchain, Gradle 8.13 via the wrapper. Do not change the toolchain without a reason; CI builds on JDK 21.
- JAXB schema classes are generated at build time by `xjc` from
  `src/main/resources/org/cip4/lib/xjdf/schema/jdfschema_2_x.xsd` using
  `src/main/resources/org/cip4/lib/xjdf/binding.xjb`. Output goes to `src/generated`.
  Never edit `src/generated`; change the XSD or `binding.xjb` instead.
- Handwritten code lives in `src/main/java/org/cip4/lib/xjdf`, tests in `src/test/java`.
- Version comes from `-PprojectVersion`, otherwise it defaults to `2.3.x-DEV`.
- `gradle/deploy.gradle` is legacy, unapplied, and not part of the build.

## Build and test commands

```powershell
.\gradlew.bat build                     # compile, xjc, test, jars
.\gradlew.bat test                      # tests only
.\gradlew.bat test --tests "org.cip4.lib.xjdf.type.*"   # one package
.\gradlew.bat compileJava               # quick compile including xjc
```

Always run `.\gradlew.bat test` (or at least the affected package) before reporting a task as done. There is no separate lint or typecheck task.

### Known build side effect

The `updateSchema` task downloads the XSDs from `https://schema.cip4.org` during Gradle configuration, on every invocation, and rewrites the tracked
`src/main/resources/org/cip4/lib/xjdf/schema/jdfschema_2_x.xsd`.
This behaviour is intentional and must not be "fixed" without approval. After running Gradle, revert the unrelated change:

```powershell
git checkout -- src/main/resources/org/cip4/lib/xjdf/schema/jdfschema_2_x.xsd
```

Never commit that file unless the schema update is the point of the change.

## The `type` package

`org.cip4.lib.xjdf.type` contains immutable value objects that also act as JAXB `XmlAdapter`s.

- Leaf types (`XYPair`, `Matrix`, `Shape`, `Rectangle`, `DateTime`, `Duration`, `URI`, `IDREF`,
  `IntegerList`, `NMTokens`, `DoubleAdapter`) are `final`. Keep them final.
- New types extend `AbstractXJdfType<ValueType, BoundType>` or `AbstractList<T>`.
- All types must be `Serializable`: the generated schema classes are serializable and hold these values.
- Equality is string-based in `AbstractXJdfType`. Do not add float precision to `toString()`.
- Parse whitespace-separated values with the package-private `XmlValues` helper and throw
  `IllegalArgumentException` for bad input. Do not throw raw `NumberFormatException` or `ArrayIndexOutOfBoundsException`.
- Marshal numeric XML values with `Locale.US` and fixed precision.
- To bind a new XSD simple type, add an `xjc:javaType` entry to `binding.xjb` and implement the adapter.
  This changes generated getter types, so treat it as a breaking change.

## Conventions

- Group id `org.cip4.lib.xjdf`; public API in `org.cip4.lib.xjdf`.
- Tests use JUnit 5 (Jupiter), including `junit-jupiter-params`, junit-pioneer, Mockito and Hamcrest.
  Prefer parameterized tests, round-trip tests and explicit invalid-input tests.
- Keep public API changes backwards compatible unless the change is explicitly a breaking release.
  Return `null` for absent values where the existing API does so; do not switch to `Optional` in public signatures.
- Do not add comments to code unless they explain non-obvious behaviour.
- Do not reintroduce Codecov, dependabot, or references to reusable workflows in `cip4/.github`.

## CI

- `.github/workflows/pull-request.yml` runs `gradlew test` on Ubuntu, macOS and Windows.
- `.github/workflows/publish.yml` publishes snapshots on pushes to `main` and releases on `X.Y.Z` tag pushes.
  It uses the composite action `.github/actions/setup` and requires the secrets
  `SIGNING_KEY`, `SIGNING_KEY_ID`, `SIGNING_PASSWORD`, `OSSRH_USERNAME`, `OSSRH_PASSWORD`.
- CodeQL runs through GitHub "Default setup"; there is no CodeQL workflow file.
