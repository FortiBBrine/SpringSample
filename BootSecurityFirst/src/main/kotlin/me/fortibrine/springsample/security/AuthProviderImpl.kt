package me.fortibrine.springsample.security

import me.fortibrine.springsample.service.PersonDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Component

@Component
class AuthProviderImpl @Autowired constructor(
    private val personDetailsService: PersonDetailsService
) : AuthenticationProvider {

    override fun authenticate(authentication: Authentication): Authentication {
        val name = authentication.name
        val personDetails = personDetailsService.loadUserByUsername(name)
        val password = authentication.credentials.toString()
        if (password != personDetails.password) {
            throw BadCredentialsException("Incorrect password")
        }

        return UsernamePasswordAuthenticationToken(
            personDetails,
            password,
            emptyList()
        )
    }

    override fun supports(authentication: Class<*>): Boolean = true

}