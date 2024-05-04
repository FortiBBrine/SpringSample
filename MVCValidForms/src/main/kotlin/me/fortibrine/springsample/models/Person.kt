package me.fortibrine.springsample.models

import javax.validation.constraints.Email
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

class Person (
    var id: Int,

    @field:NotEmpty(message = "name should not be empty")
    @field:Size(min = 2, max = 30, message = "should be between 2 and 30 characters")
    var name: String,

    @field:Min(value = 0, message = "age should be greater than zero")
    var age: Int,

    @field:NotEmpty(message = "email should not be empty")
    @field:Email(message = "email should be valid")
    var email: String
) {

    constructor(): this(0, "", 0, "")

}