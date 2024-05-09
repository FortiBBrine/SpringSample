package me.fortibrine.springsample.repository

import me.fortibrine.springsample.models.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface PeopleRepository: JpaRepository<Person, Int> {
    fun findByUsername(username: String): Optional<Person>
}
