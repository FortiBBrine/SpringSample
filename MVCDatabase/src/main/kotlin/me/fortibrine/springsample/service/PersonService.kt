package me.fortibrine.springsample.service

import me.fortibrine.springsample.models.Person
import me.fortibrine.springsample.repository.PeopleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PersonService @Autowired constructor(
    private val peopleRepository: PeopleRepository
) {

    fun getPeople(): List<Person> {
        return peopleRepository.findAll().toList()
    }

    fun personById(id: Int): Person {
        return peopleRepository.findByIdOrNull(id) ?: Person()
    }

    fun save(person: Person) {
        peopleRepository.save(person)
    }

    fun update(id: Int, person: Person) {
        peopleRepository.save(person)
    }

    fun delete(id: Int) {
        peopleRepository.deleteById(id)
    }

}