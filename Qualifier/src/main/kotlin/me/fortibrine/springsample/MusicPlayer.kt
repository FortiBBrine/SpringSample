package me.fortibrine.springsample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class MusicPlayer @Autowired constructor(
    @Qualifier("rockMusic") val music1: Music,
    @Qualifier("classicalMusic") val music2: Music
) {

    fun playMusic() = "Playing: ${music1.getSong()}, ${music2.getSong()}"

}