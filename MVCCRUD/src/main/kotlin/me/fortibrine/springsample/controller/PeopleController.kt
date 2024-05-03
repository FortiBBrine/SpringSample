package me.fortibrine.springsample.controller

import me.fortibrine.springsample.dao.PersonDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/people")
class PeopleController {

    @Autowired
    private lateinit var personDAO: PersonDAO

    @GetMapping("")
    fun index(model: Model): String {
        model.addAttribute("people", personDAO.people)
        return "people/index"
    }

    @GetMapping("/{id}")
    fun show(
        @PathVariable("id") id: Int,
        model: Model
    ): String {
        model.addAttribute("person", personDAO.personById(id))
        return "people/show"
    }

}