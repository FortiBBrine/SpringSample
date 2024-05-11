package me.fortibrine.springsample.models

import javax.persistence.*

@Entity
@Table(name = "users")
class MyUser (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @field:Column(unique = true)
    var name: String,
    var password: String,
    var roles: String
) {
    constructor(): this(null, "", "", "")
}
