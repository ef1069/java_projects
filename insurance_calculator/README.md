# Insurance Calculator

This folder contains a small Java console app `ch3Proj2.Insurance`.

Build and package into a Windows EXE (requires JDK 17+ with `jpackage`):

1) Open PowerShell and run the build script to compile and create a runnable JAR:

```powershell
cd insurance_calculator
.\build.ps1
```

2) Create a Windows EXE using `jpackage` (this will call the build script first):

```powershell
cd insurance_calculator
.\package.ps1
```