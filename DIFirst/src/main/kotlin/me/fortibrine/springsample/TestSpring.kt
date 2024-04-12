package me.fortibrine.springsample

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    val musicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)
    musicPlayer.playMusic()
    context.close()
}