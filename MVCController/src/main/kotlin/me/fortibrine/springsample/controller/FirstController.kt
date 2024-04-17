package me.fortibrine.springsample.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/first")
class FirstController {

    @GetMapping("/hello")
    fun helloPage(): String = "first/hello"

    @GetMapping("/goodbye")
    fun goodByePage(): String = "first/goodbye"

}