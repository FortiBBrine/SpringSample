package me.fortibrine.springsample.security

import me.fortibrine.springsample.service.PersonDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Component

@Component
class AuthProviderImpl @Autowired constructor(
    private val personDetailsService: PersonDetailsService
) : AuthenticationProvider {

    override fun authenticate(authentication: Authentication?): Authentication {

    }

}