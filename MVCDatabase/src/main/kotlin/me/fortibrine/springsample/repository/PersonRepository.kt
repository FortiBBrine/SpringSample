package me.fortibrine.springsample.repository

import me.fortibrine.springsample.models.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<Person, Int> {
}