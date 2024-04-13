package me.fortibrine.springsample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class MusicPlayer @Autowired constructor(
    @Qualifier("rockMusic") val music1: Music,
    @Qualifier("classicalMusic") val music2: Music
) {

    @Value("\${musicPlayer.name}")
    var name: String? = null

    @Value("\${musicPlayer.volume}")
    var volume: Int? = null

    fun playMusic() = "Playing: ${music1.getSong()}, ${music2.getSong()}"

}