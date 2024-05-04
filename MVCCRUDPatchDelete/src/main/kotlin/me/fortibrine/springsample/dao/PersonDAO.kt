package me.fortibrine.springsample.dao

import me.fortibrine.springsample.models.Person
import org.springframework.stereotype.Component

@Component
class PersonDAO {
    val people: MutableList<Person> = mutableListOf(
        Person(id = 1, name = "Tom"),
        Person(id = 2, name = "Bob"),
        Person(id = 3, name = "Mike"),
        Person(id = 4, name = "Katy")
    )

    fun personById(id: Int): Person? = people.firstOrNull { it.id == id }
    fun save(person: Person) {
        person.id = people.size + 1
        people.add(person)
    }
    fun update(id: Int, person: Person) {
        val targetPerson = personById(id)
        targetPerson?.name = person.name
    }
    fun delete(id: Int) {
        people.removeIf { it.id == id }
    }

}