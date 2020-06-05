# CIP4 XJDF Java Library
 [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.cip4.lib.xjdf/xJdfLib/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.cip4.lib.xjdf/xJdfLib) [![License (CIP4 Software License)](https://img.shields.io/badge/license-CIP4%20Software%20License-blue)](https://github.com/cip4/xJdfLib/blob/master/LICENSE.md)
 
 The CIP4 XJDF Java Library.
 
 ## Issue Tracking
Don't write issues, provide Pull-Requests!

## Development Notes
### Release a new Version
Creation and publishing of a new version to GitHub Release and to the Central Maven Repository. 

**NOTE:** The publication to the Central Maven Repository may take up to two hours.

```bash
$ git tag -a xJdfLib-[VERSION] -m "[TITLE]"
$ git push origin xJdfLib-[VERSION]
```

In case a build has been failed, a tag can be deleted using the following command:
```bash
$ git tag -d xJdfLib-[VERSION]
$ git push origin :refs/tags/xJdfLib-[VERSION]
```

