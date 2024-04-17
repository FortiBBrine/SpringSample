plugins {
    kotlin("jvm") version "1.9.23" apply false
    id("war")
}

subprojects {

    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("application")
        plugin("war")
    }

    repositories {
        mavenCentral()
    }

    group = "me.fortibrine"
    version = "1.0"

    tasks {

        withType<JavaCompile>().configureEach {
            options.encoding = "UTF-8"
            sourceCompatibility = "8"
            targetCompatibility = "8"
        }

        withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }

    }

}
