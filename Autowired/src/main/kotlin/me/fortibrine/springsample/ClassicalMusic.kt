package me.fortibrine.springsample

import org.springframework.stereotype.Component

@Component
class ClassicalMusic: Music {
    override fun getSong(): String {
        return "Hungarian Rhapsodyr"
    }

}