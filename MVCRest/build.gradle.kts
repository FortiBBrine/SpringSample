
// IN FUTURE I WILL UPDATE SPRING TO 6 VERSION AND SET JAKARTA SERVLET

dependencies {
    implementation("org.springframework:spring-webmvc:5.3.34")
    implementation("org.thymeleaf:thymeleaf-spring5:3.1.2.RELEASE")
    implementation("javax.servlet:javax.servlet-api:4.0.1")
    implementation("org.hibernate:hibernate-validator:6.0.6.Final")
//    implementation("org.jetbrains.exposed:exposed-core:0.50.0")
//    implementation("org.jetbrains.exposed:exposed-jdbc:0.50.0")
    implementation("com.mysql:mysql-connector-j:8.4.0")

    implementation("org.springframework.data:spring-data-jpa:2.1.5.RELEASE")
    implementation("org.springframework:spring-orm:5.3.34")
    implementation("org.hibernate:hibernate-core:5.4.1.Final")

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.23")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.4.2")
}

war {
    webAppDirName = "src/main/webapp"
}