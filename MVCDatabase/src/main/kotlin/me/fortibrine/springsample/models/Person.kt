package me.fortibrine.springsample.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.Email
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

@Entity
@Table(name = "Person")
class Person (
    @field:Id
    @field:Column(name = "id")
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,

    @field:Column(name = "name")
    @field:NotEmpty(message = "name should not be empty")
    @field:Size(min = 2, max = 30, message = "should be between 2 and 30 characters")
    var name: String,

    @field:Column(name = "age")
    @field:Min(value = 0, message = "age should be greater than zero")
    var age: Int,

    @field:Column(name = "email")
    @field:NotEmpty(message = "email should not be empty")
    @field:Email(message = "email should be valid")
    var email: String
) {

    constructor(): this(0, "", 0, "")

}