package io.opengood.constants.spring

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SpringPropertySettingsTest :
    StringSpec({

        "SpringPropertySettings constant should return bean definition override property name" {
            SpringPropertySettings.BEAN_DEFINITION_OVERRIDE shouldBe "spring.main.allow-bean-definition-overriding=true"
        }
    })
