#!/bin/bash

kotlinc src/app.kt -include-runtime -d out/hello.jar
java -jar out/hello.jar