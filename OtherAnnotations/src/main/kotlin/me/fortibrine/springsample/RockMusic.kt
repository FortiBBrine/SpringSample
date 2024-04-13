package me.fortibrine.springsample

import org.springframework.stereotype.Component

//@Component("musicBean")
@Component
class RockMusic: Music {
    override fun getSong(): String {
        return "Wind cries Mary"
    }
}