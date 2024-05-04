package me.fortibrine.springsample.controller

import me.fortibrine.springsample.dao.PersonDAO
import me.fortibrine.springsample.models.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/people")
class PeopleController @Autowired constructor(
    private val personDAO: PersonDAO
) {

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

//    @GetMapping("/new")
//    fun newPerson(model: Model): String {
//        model.addAttribute("person", Person())
    @GetMapping("/new")
    fun newPerson(
        @ModelAttribute("person") person: Person
    ): String {
        return "people/new"
    }

    @PostMapping("")
    fun create(
        @ModelAttribute("person") person: Person
    ): String {
        personDAO.save(person)
        return "redirect:/people"
    }

    @GetMapping("/{id}/edit")
    fun edit(
        model: Model,
        @PathVariable("id") id: Int
    ): String {
        model.addAttribute("person", personDAO.personById(id))
        return "people/edit"
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable("id") id: Int,
        @ModelAttribute("person") person: Person
    ): String {
        personDAO.update(id, person)
        return "redirect:/people"
    }

    @DeleteMapping("/{id}")
    fun delete(
        @PathVariable("id") id: Int
    ): String {
        personDAO.delete(id)
        return "redirect:/people"
    }

}