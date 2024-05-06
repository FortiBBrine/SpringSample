package me.fortibrine.springsample.repository

import me.fortibrine.springsample.models.Person
import org.springframework.data.repository.CrudRepository

interface PeopleRepository: CrudRepository<Person, Int> {
}