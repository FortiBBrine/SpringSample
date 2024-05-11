package me.fortibrine.springsample.controllers

import me.fortibrine.springsample.security.PersonDetails
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/hello")
    fun sayHello() = "hello"

    @GetMapping("/show-user-info")
    fun showUserInfo(): String {
        val authentication = SecurityContextHolder.getContext().authentication
        val personDetails = authentication.principal as PersonDetails
        println(personDetails.person)

        return "hello"
    }

}