package me.fortibrine.springsample.service

import me.fortibrine.springsample.repository.UserRepository
import me.fortibrine.springsample.security.MyUserDetails
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class MyUserDetailsService : UserDetailsService {

    @field:Autowired
    private lateinit var repository: UserRepository

    override fun loadUserByUsername(username: String): UserDetails {
        val user = repository.findByName(username).getOrNull() ?: throw UsernameNotFoundException("$username not found")
        return MyUserDetails(user)
    }

}