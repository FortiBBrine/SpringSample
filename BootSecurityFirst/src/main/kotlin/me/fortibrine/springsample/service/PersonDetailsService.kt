package me.fortibrine.springsample.service

import me.fortibrine.springsample.repository.PeopleRepository
import me.fortibrine.springsample.security.PersonDetails
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class PersonDetailsService @Autowired constructor(
    private val peopleRepository: PeopleRepository
): UserDetailsService {

    override fun loadUserByUsername(s: String): UserDetails {
        val person = peopleRepository.findByUsername(s).getOrNull() ?: throw UsernameNotFoundException("User not found!")

        return PersonDetails(person)
    }

}