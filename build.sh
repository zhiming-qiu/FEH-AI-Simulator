#!/bin/sh
vendor/apache-ant-1.10.7/bin/ant -buildfile build.xml clean
vendor/apache-ant-1.10.7/bin/ant -buildfile build.xml test-compile