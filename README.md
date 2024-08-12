# Spring Constants Library

[![Build](https://github.com/opengood-aio/spring-constants/workflows/build/badge.svg)](https://github.com/opengood-aio/spring-constants/actions?query=workflow%3Abuild)
[![Release](https://github.com/opengood-aio/spring-constants/workflows/release/badge.svg)](https://github.com/opengood-aio/spring-constants/actions?query=workflow%3Arelease)
[![CodeQL](https://github.com/opengood-aio/spring-constants/actions/workflows/codeql.yml/badge.svg)](https://github.com/opengood-aio/spring-constants/actions/workflows/codeql.yml)
[![Codecov](https://codecov.io/gh/opengood-aio/spring-constants/branch/main/graph/badge.svg?token=AEEYTGK87F)](https://codecov.io/gh/opengood-aio/spring-constants)
[![Release Version](https://img.shields.io/github/release/opengood-aio/spring-constants.svg)](https://github.com/opengood-aio/spring-constants/releases/latest)
[![Maven Central](https://img.shields.io/maven-central/v/io.opengood.constants/spring-constants.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.opengood.constants%22%20AND%20a:%22spring-constants%22)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/opengood-aio/spring-constants/master/LICENSE)

Library containing reusable constants for Spring and Spring Boot

## Compatibility

* Java 21
* Spring Boot 3

## Setup

### Add Dependency

#### Gradle

```groovy
implementation("io.opengood.constants:spring-constants:VERSION")
```

#### Maven

```xml

<dependency>
    <groupId>io.opengood.constants</groupId>
    <artifactId>spring-constants</artifactId>
    <version>VERSION</version>
</dependency>
```

**Note:** See *Release* version badge above for latest version.

## Features

**Note:** All examples are provided in Kotlin

### Reusable Spring Properties

Common Spring properties are often referenced in code for importing
configuration values. Rather than defining these constantly, simply refer to
them as constants.

| Constant                                 | Spring Property                |
|------------------------------------------|--------------------------------|
| `SpringProperties.APPLICATION_NAME`      | `spring.application.name`      |
| `SpringProperties.DATA_MONGODB_DATABASE` | `spring.data.mongodb.database` |
| `SpringProperties.DATA_MONGODB_HOST`     | `spring.data.mongodb.host`     |
| `SpringProperties.DATA_MONGODB_PASSWORD` | `spring.data.mongodb.password` |
| `SpringProperties.DATA_MONGODB_PORT`     | `spring.data.mongodb.port`     |
| `SpringProperties.DATA_MONGODB_URI`      | `spring.data.mongodb.uri`      |
| `SpringProperties.DATA_MONGODB_USERNAME` | `spring.data.mongodb.username` |

---

### Reusable Spring Property Placeholders

Similarly, when using `@Value` to import Spring property values, one needs to
wrap `${}` around the property. These are also provided as constants one can
simply refer.

| Constant                                           | Spring Property Placeholder       |
|----------------------------------------------------|-----------------------------------|
| `SpringPropertyPlaceholders.APPLICATION_NAME`      | `${spring.application.name}`      |
| `SpringPropertyPlaceholders.DATA_MONGODB_DATABASE` | `${spring.data.mongodb.database}` |
| `SpringPropertyPlaceholders.DATA_MONGODB_HOST`     | `${spring.data.mongodb.host}`     |
| `SpringPropertyPlaceholders.DATA_MONGODB_PASSWORD` | `${spring.data.mongodb.password}` |
| `SpringPropertyPlaceholders.DATA_MONGODB_PORT`     | `${spring.data.mongodb.port}`     |
| `SpringPropertyPlaceholders.DATA_MONGODB_URI`      | `${spring.data.mongodb.uri}`      |
| `SpringPropertyPlaceholders.DATA_MONGODB_USERNAME` | `${spring.data.mongodb.username}` |

Example:

```kotlin
import io.opengood.constants.spring.SpringPropertyPlaceholders

@Configuration
class AppConfig {

    @Bean
    fun bean(@Value(SpringPropertyPlaceholders.APPLICATION_NAME) value: String): String {
        // configure bean
    }
}
```

---

### Reusable Spring Property Settings

Sometimes one needs to use defined Spring property settings and remembering a
specific property is hard. Constants are provided to simplify this:

| Constant                                          | Spring Property Setting                             |
|---------------------------------------------------|-----------------------------------------------------|
| `SpringPropertySettings.BEAN_DEFINITION_OVERRIDE` | `spring.main.allow-bean-definition-overriding=true` |

Example:

```kotlin
import io.opengood.constants.spring.SpringPropertySettings

@SpringBootTest(
    classes = [TestApplication::class],
    properties = [SpringPropertySettings.BEAN_DEFINITION_OVERRIDE],
    webEnvironment = WebEnvironment.RANDOM_PORT
)
class ControllerTest : WordSpec() {
    // do stuff
}
```
