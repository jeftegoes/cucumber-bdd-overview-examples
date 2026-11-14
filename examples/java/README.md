# Cucumber and Java <!-- omit in toc -->

## Contents <!-- omit in toc -->

- [1. Dependencies](#1-dependencies)
- [2. IntelliJ Plugins](#2-intellij-plugins)

# 1. Dependencies

```xml
    <!-- Provides Gherkin step definitions (@Given, @When, @Then). -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>8.0.4</version>
        <scope>test</scope>
    </dependency>

    <!-- Integrates Cucumber with JUnit Platform. -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit-platform-engine</artifactId>
        <version>8.0.4</version>
        <scope>test</scope>
    </dependency>

    <!-- Provides the API and engine for defining and executing test suites. -->
    <dependency>
        <groupId>org.junit.platform</groupId>
        <artifactId>junit-platform-suite</artifactId>
        <version>6.1.3</version>
        <scope>test</scope>
    </dependency>
```

# 2. IntelliJ Plugins

- [Cucumber for Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java)
