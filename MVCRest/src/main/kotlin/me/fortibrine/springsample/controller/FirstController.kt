package me.fortibrine.springsample.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/first")
class FirstController {

    @GetMapping("/hello")
    fun helloPage(
        @RequestParam("name", required = false) name: String,
        @RequestParam("surname", required = false) surname: String,
        model: Model
    ): String {

//        println("Hello, $name $surname")
        model.addAttribute("message", "Hello, $name $surname")

        return "first/hello"
    }

    @GetMapping("/goodbye")
    fun goodByePage(): String = "first/goodbye"

    @GetMapping("/calculator")
    fun calculator(
        @RequestParam("a") a: Int,
        @RequestParam("b") b: Int,
        @RequestParam("action") action: String,
        model: Model
    ): String {

        val result = when(action) {
            "multiplication" -> a.toDouble() * b.toDouble()
            "division" -> a.toDouble() / b.toDouble()
            "subtraction" -> a.toDouble() - b.toDouble()
            "addition" -> a.toDouble() + b.toDouble()
            else -> 0.0
        }

        model.addAttribute("result", result)

        return "first/calculator"
    }

}