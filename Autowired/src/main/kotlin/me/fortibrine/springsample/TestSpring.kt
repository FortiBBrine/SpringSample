package me.fortibrine.springsample

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
//    val music = context.getBean("rockMusic", Music::class.java)
//    val musicPlayer = MusicPlayer(music)
//    musicPlayer.playMusic()
//
//    val music2 = context.getBean("classicalMusic", Music::class.java)
//    val classicalMusicPlayer = MusicPlayer(music2)
//    classicalMusicPlayer.playMusic()

//    val musicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)
//    musicPlayer.playMusic()

    val computer = context.getBean("computer", Computer::class.java)
    println(computer)

    context.close()
}