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

}