package me.fortibrine.springsample.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping("/first")
class FirstController {

//    @GetMapping("/hello")
//    fun helloPage(request: HttpServletRequest): String {

//        val name = request.getParameter("name")
//        val surname = request.getParameter("surname")

    @GetMapping("/hello")
    fun helloPage(
        @RequestParam("name") name: String,
        @RequestParam("surname") surname: String
    ): String {

        println("Hello, $name $surname")

        return "first/hello"
    }

    @GetMapping("/goodbye")
    fun goodByePage(): String = "first/goodbye"

}