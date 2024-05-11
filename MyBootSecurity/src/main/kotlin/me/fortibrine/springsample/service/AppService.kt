package me.fortibrine.springsample.service

import com.github.javafaker.Faker
import me.fortibrine.springsample.models.Application
import me.fortibrine.springsample.models.MyUser
import me.fortibrine.springsample.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import java.util.stream.IntStream
import javax.annotation.PostConstruct

@Service
class AppService(
    private val repository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {

    val applications: MutableList<Application> = mutableListOf()

    @PostConstruct
    fun loadAppInDB() {
        val faker = Faker()
        applications.addAll(
            IntStream.rangeClosed(1, 100)
                .mapToObj { i -> Application(
                    id = i,
                    name = faker.app().name(),
                    author = faker.app().author(),
                    version = faker.app().version()
                ) }
                .collect(Collectors.toList())
        )
    }

    fun applicationByID(id: Int): Application? {
        return applications.firstOrNull { it.id == id }
    }

    fun addUser(user: MyUser) {
        user.password = passwordEncoder.encode(user.password)
        repository.save(user)
    }

}