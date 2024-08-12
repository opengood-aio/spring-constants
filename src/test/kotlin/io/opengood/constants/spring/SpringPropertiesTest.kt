package io.opengood.constants.spring

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SpringPropertiesTest :
    StringSpec({

        "SpringProperties constant should return spring application property name" {
            SpringProperties.APPLICATION_NAME shouldBe "spring.application.name"
        }

        "SpringProperties constant should return spring data MongoDB database property name" {
            SpringProperties.DATA_MONGODB_DATABASE shouldBe "spring.data.mongodb.database"
        }

        "SpringProperties constant should return spring data MongoDB host property name" {
            SpringProperties.DATA_MONGODB_HOST shouldBe "spring.data.mongodb.host"
        }

        "SpringProperties constant should return spring data MongoDB password property name" {
            SpringProperties.DATA_MONGODB_PASSWORD shouldBe "spring.data.mongodb.password"
        }

        "SpringProperties constant should return spring data MongoDB port property name" {
            SpringProperties.DATA_MONGODB_PORT shouldBe "spring.data.mongodb.port"
        }

        "SpringProperties constant should return spring data MongoDB URI property name" {
            SpringProperties.DATA_MONGODB_URI shouldBe "spring.data.mongodb.uri"
        }

        "SpringProperties constant should return spring data MongoDB username property name" {
            SpringProperties.DATA_MONGODB_USERNAME shouldBe "spring.data.mongodb.username"
        }
    })
