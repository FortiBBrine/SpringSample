
val springBootVersion = "2.7.15"

plugins {
    id("org.springframework.boot") version "2.6.7"
    id("io.spring.dependency-management") version "1.1.4"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.6.4")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity5:3.1.2.RELEASE")

    implementation("org.hibernate:hibernate-core:5.6.8.Final")

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.23")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.4.2")

    implementation("com.mysql:mysql-connector-j:8.4.0")

}

application {
    mainClass = "me.fortibrine.springsample.SpringSampleApplicationKt"
}