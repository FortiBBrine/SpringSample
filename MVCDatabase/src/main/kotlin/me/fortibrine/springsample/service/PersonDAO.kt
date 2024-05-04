package me.fortibrine.springsample.service

import me.fortibrine.springsample.models.Person
import me.fortibrine.springsample.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonDAO @Autowired constructor(
    private val personRepository: PersonRepository
) {

    fun getPeople(): List<Person> = personRepository.findAll()

    fun personById(id: Int): Person {
        return personRepository.findById(id).get()
    }

    fun save(person: Person) {
        personRepository.save(person)
    }
    fun update(id: Int, person: Person) {
        val targetPerson = personById(id)
        targetPerson.name = person.name
        targetPerson.age = person.age
        targetPerson.email = person.email
        personRepository.save(targetPerson)
    }
    fun delete(id: Int) {
        personRepository.deleteById(id)
    }

}