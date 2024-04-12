package me.fortibrine.springsample

class MusicPlayer(
    var music: Music? = null,
    var name: String? = null,
    var volume: Int? = null
) {

    fun playMusic() {
        println("Playing: " + music?.getSong())
    }

}