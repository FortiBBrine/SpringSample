package me.fortibrine.springsample.models

import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

@Entity
@Table(name = "PEOPLE")
class Person (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int?,

    @field:Column(name = "NAME", nullable = false)
    @field:NotEmpty(message = "name should not be empty")
    @field:Size(min = 2, max = 30, message = "should be between 2 and 30 characters")
    var name: String,

    @field:Column(name = "AGE", nullable = false)
    @field:Min(value = 0, message = "age should be greater than zero")
    var age: Int,

    @field:Column(name = "EMAIL", nullable = false)
    @field:NotEmpty(message = "email should not be empty")
    @field:Email(message = "email should be valid")
    var email: String
) {

    constructor(): this(null, "", 0, "")

}