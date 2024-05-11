package me.fortibrine.springsample.repository

import me.fortibrine.springsample.models.MyUser
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface UserRepository: JpaRepository<MyUser, Long> {
    fun findByName(username: String): Optional<MyUser>
}