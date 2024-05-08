package me.fortibrine.springsample.controller

import me.fortibrine.springsample.models.Person
import me.fortibrine.springsample.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class RestController @Autowired constructor(
    private val personService: PersonService
) {

    @GetMapping("/people", produces = ["application/json"])
    fun getAll(): List<Person> {
        return personService.getPeople()
    }

}