package me.fortibrine.springsample

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    val music = context.getBean("musicBean", Music::class.java)
    val musicPlayer = MusicPlayer(music)
    musicPlayer.playMusic()
    context.close()
}