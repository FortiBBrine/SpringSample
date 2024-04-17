dependencies {
    implementation("org.springframework:spring-webmvc:5.3.34")
    implementation("org.thymeleaf:thymeleaf-spring5:3.1.2.RELEASE")
    implementation("javax.servlet:javax.servlet-api:4.0.1")
}

war {
    webAppDirName = "src/main/webapp"
}