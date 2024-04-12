package me.fortibrine.springsample

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    val firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)
    val secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer::class.java)

    val comparison = firstMusicPlayer == secondMusicPlayer

    println(comparison)

    println(firstMusicPlayer)
    println(secondMusicPlayer)

    firstMusicPlayer.volume = 10

    println(firstMusicPlayer.volume)
    println(secondMusicPlayer.volume)

//    println(musicPlayer.name)
//    println(musicPlayer.volume)

    context.close()
}