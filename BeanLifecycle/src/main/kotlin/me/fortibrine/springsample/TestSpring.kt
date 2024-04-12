package me.fortibrine.springsample

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")

    val music = context.getBean("musicBean", ClassicalMusic::class.java)

    println(music.getSong())

    context.close()
}