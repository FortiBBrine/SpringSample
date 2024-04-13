package me.fortibrine.springsample

class MusicPlayer(val music: Music) {

    fun playMusic() {
        println("Playing: " + music.getSong())
    }

}