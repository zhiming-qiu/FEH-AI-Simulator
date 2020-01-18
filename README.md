[![Build Status](https://travis-ci.com/EachOneChew/FEH-AI-Simulator.svg?branch=master)](https://travis-ci.com/EachOneChew/FEH-AI-Simulator)
![codecov](https://codecov.io/gh/zhiming-qiu/FEH-AI-Simulator/branch/master/graph/badge.svg)



![GitHub contributors](https://img.shields.io/github/contributors/EachOneChew/FEH-AI-Simulator)
![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/EachOneChew/FEH-AI-Simulator?include_prereleases)
![GitHub repo size](https://img.shields.io/github/repo-size/EachOneChew/FEH-AI-Simulator)
![GitHub](https://img.shields.io/github/license/EachOneChew/FEH-AI-Simulator)


# Fire Emblem Heroes: AI Simulator

An attempt at creating a tool that simulates AI behaviour in [Fire Emblem Heroes](https://en.m.wikipedia.org/wiki/Fire_Emblem_Heroes).

# Dependency

This repo depends on a distance calculator based on [Dijkstra's Algorithm](https://en.m.wikipedia.org/wiki/Dijkstra's_algorithm).

The distance calculator implementation can be found in [release page](https://github.com/EachOneChew/Dijkstra-s-Algorithm-FEH/releases). Go pick up a release and find the jar link in asset section, eg [Assets|distance-calculator.jar](https://github.com/EachOneChew/Dijkstra-s-Algorithm-FEH/releases/download/v0.2-alpha/distance-calculator.jar). Once you grab the jar file, put in folder `lib` in current repo.

# Folder Organization

* `src` keeps Java source files
* `lib` keeps libraries this project depends on
* `test` keeps unit test files
* `vendor` keeps tools/libs for infrastructure and processes

# Build

This project uses `ant` as the build system. To start a build, simply open terminal and run command:

```
./build.sh
```

The build process consists of tasks defined in `build.xml`. The dependency between these tasks is also specified.

If the build is successful, the following folders will be created and populated:

* `release-build` keeps compiled Java class files ready for release
* `debug-build` keeps compiled Java class files with debug info embedded for testing/debugging/instrumentation purposes
* `test-build` keeps compiled Java class files for unit tests
* `test-report` keeps various reports based on test execution

If the build fails, take a look at the console output to figure out where build fails. Folder `test-report` has error reports for checkstyle violations and unit test failures.

  - `test-report/checkstyle_report.xml` tells any style violations. For now google style is used and the current checkstyle config  does not tolerate any warnings. You may also tailor the check style file to suit your needs.
  - Under `test-report`, you can find each unit test's output as a txt file.
  - To check coverage report, open local file `${repo-dir}/test-report/cov-report/index.html` for more details.
