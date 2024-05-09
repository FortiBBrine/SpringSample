package me.fortibrine.springsample.models

import javax.persistence.*
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

@Entity
@Table(name = "Person")
class Person(
    @field:Id
    @field:Column(name = "id")
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int?,

    @field:NotEmpty(message = "Имя не должно быть пустым")
    @field:Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной")
    @field:Column(name = "username")
    var username: String,

    @field:Min(value = 1900, message = "Год рождения должен быть больше, чем 1900")
    @field:Column(name = "year_of_birth")
    var yearOfBirth: Int,

    @field:Column(name = "password")
    var password: String
) {

    constructor(): this(null, "", 0, "")

}