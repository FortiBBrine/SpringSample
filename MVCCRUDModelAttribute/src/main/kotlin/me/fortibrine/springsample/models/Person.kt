package me.fortibrine.springsample.models

class Person (
    var id: Int,
    var name: String?
) {

    constructor(): this(0, null)

}