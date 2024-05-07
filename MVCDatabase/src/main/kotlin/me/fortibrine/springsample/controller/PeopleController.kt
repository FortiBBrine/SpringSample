package me.fortibrine.springsample.controller

import javax.validation.Valid
import me.fortibrine.springsample.service.PersonService
import me.fortibrine.springsample.models.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
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
    private val personService: PersonService
) {

    @GetMapping("")
    fun index(model: Model): String {
        model.addAttribute("people", personService.getPeople())
        return "people/index"
    }

    @GetMapping("/{id}")
    fun show(
        @PathVariable("id") id: Int,
        model: Model
    ): String {
        model.addAttribute("person", personService.personById(id))
        return "people/show"
    }

    @GetMapping("/new")
    fun newPerson(model: Model): String {
        model.addAttribute("person", Person())
        return "people/new"
    }

    @PostMapping("")
    fun create(
        @ModelAttribute("person")
        @Valid
        person: Person,

        bindingResult: BindingResult
    ): String {

        if (bindingResult.hasErrors()) {
            return "people/new"
        }

        personService.save(person)
        return "redirect:/people"
    }

    @GetMapping("/{id}/edit")
    fun edit(
        model: Model,
        @PathVariable("id") id: Int
    ): String {
        model.addAttribute("person", personService.personById(id))
        return "people/edit"
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable("id") id: Int,
        @ModelAttribute("person")
        @Valid
        person: Person,
        bindingResult: BindingResult
    ): String {

        if (bindingResult.hasErrors()) {
            return "people/edit"
        }

        personService.update(id, person)
        return "redirect:/people"
    }

    @DeleteMapping("/{id}")
    fun delete(
        @PathVariable("id") id: Int
    ): String {
        personService.delete(id)
        return "redirect:/people"
    }

}