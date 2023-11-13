plugins {
    id("io.opengood.gradle.config")
}

group = "io.opengood.constants"

opengood {
    artifact {
        description = "Library containing reusable constants for Spring and Spring Boot"
    }
    features {
        assertj = false
        jackson = false
        jacksonKotlin = false
        junitJupiter = false
        kotest = true
        kotestSpring = false
        kotlinCoroutines = false
        lombok = false
        mockito = false
        mockk = false
        spring = false
        springMockk = false
    }
}
