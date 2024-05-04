package me.fortibrine.springsample.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SecondController {

    @GetMapping("/exit")
    fun exit(): String = "second/exit"

}