# Serenity Cucumber Starter project

[![CircleCI](https://circleci.com/gh/serenity-bdd/serenity-cucumber-starter.svg?style=svg)](https://circleci.com/gh/serenity-bdd/serenity-cucumber-starter)


This is the simplest possible build script setup for Cucumber using Java. 
The idea for this project is stolen from/inspired by the Cucumber Java Skeleton project (https://github.com/cucumber/cucumber-java-skeleton).

This is a very minimal sample project using Cucumber and Serenity BDD in Java. 
You can use this project as a quick starting point for your own projects.

There is a single feature file with one scenario. The scenario has three steps, the last of which is pending. 

## Get the code

Git:

    git clone https://github.com/serenity-bdd/serenity-cucumber-starter.git
    cd serenity-cucumber-starter


Or simply [download a zip](https://github.com/serenity-bdd/serenity-cucumber-starter/archive/master.zip) file.

## Use Maven

Open a command window and run:

    mvn clean verify

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `CucumberTestSuite`
class tells JUnit to kick off Cucumber.

## Use Gradle

Open a command window and run:

    gradlew test aggregate

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(CucumberWithSerenity.class)` annotation on the `CucumberTestSuite`
class tells JUnit to kick off Cucumber.

## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

## Overriding options

The Cucumber runtime parses command line options to know what features to run, where the glue code lives, what plugins to use etc.
When you use the JUnit runner, these options are generated from the `@CucumberOptions` annotation on your test.

Sometimes it can be useful to override these options without changing or recompiling the JUnit class. This can be done with the
`cucumber.options` system property. The general form is:

Using Maven:

    mvn -Dcucumber.options="..." test

Using Gradle:

    gradlew -Dcucumber.options="..." test

Let's look at some things you can do with `cucumber.options`. Try this:

    -Dcucumber.options="--help"

That should list all the available options.

### Run a subset of Features or Scenarios

Specify a particular scenario by *line* (and use the pretty plugin, which prints the scenario back)

    -Dcucumber.options="classpath:skeleton/belly.feature:4 --plugin pretty"

This works because Maven puts `./src/test/resources` on your `classpath`.
You can also specify files to run by filesystem path:

    -Dcucumber.options="src/test/resources/skeleton/belly.feature:4 --plugin pretty"

You can also specify what to run by *tag*:

    -Dcucumber.options="--tags @bar --plugin pretty"

### Running only the scenarios that failed in the previous run

    -Dcucumber.options="@target/rerun.txt"

This works as long as you have the `rerun` formatter enabled.

### Specify a different formatter:

For example a JUnit formatter:

    -Dcucumber.options="--plugin junit:target/cucumber-junit-report.xml"