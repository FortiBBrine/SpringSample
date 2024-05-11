package me.fortibrine.springsample.controllers

import me.fortibrine.springsample.models.MyUser
import me.fortibrine.springsample.service.AppService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/apps")
open class AppController @Autowired constructor(
    private val service: AppService
) {
    @GetMapping("/welcome")
    open fun welcome() = "Welcome to the unprotected page"

    @GetMapping("/all-app")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    open fun allApplications() = service.applications

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    open fun applicationByID(@PathVariable id: Int) = service.applicationByID(id)

    @PostMapping("/new-user")
    open fun addUser(@RequestBody user: MyUser): String {
        service.addUser(user)
        return "User is saved"
    }
}