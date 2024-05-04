
// IN FUTURE I WILL UPDATE SPRING TO 6 VERSION AND SET JAKARTA SERVLET

dependencies {
    implementation("org.springframework:spring-webmvc:5.3.34")
    implementation("org.thymeleaf:thymeleaf-spring5:3.1.2.RELEASE")
    implementation("javax.servlet:javax.servlet-api:4.0.1")
    implementation("org.hibernate:hibernate-validator:6.0.6.Final")
    implementation("org.springframework.data:spring-data-jpa:2.7.14")
    implementation("com.mysql:mysql-connector-j:8.4.0")
    implementation("org.hibernate:hibernate-core:5.4.1.Final")
}

war {
    webAppDirName = "src/main/webapp"
}