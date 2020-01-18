# Fire Emblem Heroes: AI Simulator

An attempt at creating a tool that simulates AI behaviour in Fire Emblem Heroes.

# Dependency

This repo depends on a distance calculator based on Dijkstra's Algorithm.

The distance calculator implementation can be found in [release page](https://github.com/EachOneChew/Dijkstra-s-Algorithm-FEH/releases). Go pick up a release and find the jar link in asset section, eg [Assets|distance-calculator.jar](https://github.com/EachOneChew/Dijkstra-s-Algorithm-FEH/releases/download/v0.2-alpha/distance-calculator.jar). Once you grab the jar file, put in folder `lib` in current repo.

# Folder Organization

* `src` keeps Java source files
* `lib` keeps libraries this project depends on
* `test` keeps unit test files
* `vendor` keeps tools/libs for infrastructure and processes

# Build

This project uses `ant` as the build system. To start a build, simply open a terminal and run command:

```
./build.sh
```

If the build is successful, the following folders will be created:

* `release-build` keeps compiled Java class files ready for release
* `debug-build` keeps compiled Java class files with debug info embedded for testing/debugging/instrumentation purposes
* `test-build` keeps compiled Java class files for unit tests
* `test-report` keeps various reports based on test execution

If the build fails, take a look at the console output to figure out whewre build fails. Folder `test-report` has error reports for checkstyle violations and unit test failures.