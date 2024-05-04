package me.fortibrine.springsample.dao

import me.fortibrine.springsample.models.Person
import org.springframework.stereotype.Component

@Component
class PersonDAO {

    companion object {
        @JvmStatic
        var COUNT = 0
    }

    val people: MutableList<Person> = mutableListOf(
        Person(id = ++COUNT, name = "Tom", age = 24, email = "tom@gmail.com"),
        Person(id = ++COUNT, name = "Bob", age = 52, email = "bob@gmail.com"),
        Person(id = ++COUNT, name = "Mike", age = 18, email = "mike@gmail.com"),
        Person(id = ++COUNT, name = "Katy", age = 34, email = "katy@gmail.com")
    )

    fun personById(id: Int): Person? = people.firstOrNull { it.id == id }
    fun save(person: Person) {
        person.id = ++COUNT
        people.add(person)
    }
    fun update(id: Int, person: Person) {
        val targetPerson = personById(id)
        targetPerson?.name = person.name
        targetPerson?.age = person.age
        targetPerson?.email = person.email
    }
    fun delete(id: Int) {
        people.removeIf { it.id == id }
    }

}