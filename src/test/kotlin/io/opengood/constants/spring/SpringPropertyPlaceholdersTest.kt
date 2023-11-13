package io.opengood.constants.spring

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SpringPropertyPlaceholdersTest : StringSpec({

    "SpringPropertyPlaceholders constant should return spring application property placeholder" {
        SpringPropertyPlaceholders.APPLICATION_NAME shouldBe "${'$'}{spring.application.name}"
    }

    "SpringPropertyPlaceholders constant should return spring data MongoDB database property placeholder" {
        SpringPropertyPlaceholders.DATA_MONGODB_DATABASE shouldBe "${'$'}{spring.data.mongodb.database}"
    }

    "SpringPropertyPlaceholders constant should return spring data MongoDB host property placeholder" {
        SpringPropertyPlaceholders.DATA_MONGODB_HOST shouldBe "${'$'}{spring.data.mongodb.host}"
    }

    "SpringPropertyPlaceholders constant should return spring data MongoDB password property placeholder" {
        SpringPropertyPlaceholders.DATA_MONGODB_PASSWORD shouldBe "${'$'}{spring.data.mongodb.password}"
    }

    "SpringPropertyPlaceholders constant should return spring data MongoDB port property placeholder" {
        SpringPropertyPlaceholders.DATA_MONGODB_PORT shouldBe "${'$'}{spring.data.mongodb.port}"
    }

    "SpringPropertyPlaceholders constant should return spring data MongoDB URI property placeholder" {
        SpringPropertyPlaceholders.DATA_MONGODB_URI shouldBe "${'$'}{spring.data.mongodb.uri}"
    }

    "SpringPropertyPlaceholders constant should return spring data MongoDB username property placeholder" {
        SpringPropertyPlaceholders.DATA_MONGODB_USERNAME shouldBe "${'$'}{spring.data.mongodb.username}"
    }
})
