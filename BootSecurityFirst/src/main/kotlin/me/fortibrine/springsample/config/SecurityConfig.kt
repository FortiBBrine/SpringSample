package me.fortibrine.springsample.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableWebSecurity
class SecurityConfig @Autowired constructor(

): WebSecurityConfigurerAdapter() {


}