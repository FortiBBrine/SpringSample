package me.fortibrine.springsample

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/hello-world")
    fun sayHello(): String = "hello_world"

}