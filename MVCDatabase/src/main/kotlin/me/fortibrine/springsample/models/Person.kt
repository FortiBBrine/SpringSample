package me.fortibrine.springsample.models

import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

@Entity
@Table(name = "PEOPLE")
open class Person (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.AUTO)
    open var id: Int,

    @field:Column(name = "NAME", nullable = false)
    @field:NotEmpty(message = "name should not be empty")
    @field:Size(min = 2, max = 30, message = "should be between 2 and 30 characters")
    open var name: String,

    @field:Column(name = "AGE", nullable = false)
    @field:Min(value = 0, message = "age should be greater than zero")
    open var age: Int,

    @field:Column(name = "EMAIL", nullable = false)
    @field:NotEmpty(message = "email should not be empty")
    @field:Email(message = "email should be valid")
    open var email: String
) {

    constructor(): this(0, "", 0, "")

}