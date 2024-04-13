package me.fortibrine.springsample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
data class Computer @Autowired constructor(
    private val musicPlayer: MusicPlayer
)