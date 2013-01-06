@ECHO OFF

:: path settings
SET rootPath=%~dp0

cls
echo.
echo -------------------------------
echo   XJDF Schema Update
echo -------------------------------


:: update schema
echo.
echo   Update Schema...
echo.
chdir /D %rootPath%
mvn antrun:run