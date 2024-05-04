
// IN FUTURE I WILL UPDATE SPRING TO 6 VERSION AND SET JAKARTA SERVLET

dependencies {
    implementation("org.springframework:spring-webmvc:5.3.34")
    implementation("org.thymeleaf:thymeleaf-spring5:3.1.2.RELEASE")
    implementation("javax.servlet:javax.servlet-api:4.0.1")
    implementation("org.hibernate:hibernate-validator:6.0.6.Final")
}

war {
    webAppDirName = "src/main/webapp"
}