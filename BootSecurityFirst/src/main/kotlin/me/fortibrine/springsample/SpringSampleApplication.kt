package me.fortibrine.springsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringSampleApplication

fun main(args: Array<String>) {
    runApplication<SpringSampleApplication>(*args)
}