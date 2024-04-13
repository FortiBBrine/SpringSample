package me.fortibrine.springsample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MusicPlayer @Autowired constructor(
    val classicalMusic: ClassicalMusic,
    val rockMusic: RockMusic
) {

    fun playMusic() = "Playing: ${classicalMusic.getSong()}"

}