package me.fortibrine.springsample

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
//@Scope("prototype")
class ClassicalMusic: Music {
    override fun getSong(): String {
        return "Hungarian Rhapsodyr"
    }

    @PostConstruct
    fun doMyInit() {
        println("Doing my initialization")
    }

    @PreDestroy
    fun doMyDestroy() {
        println("Doing my destruction")
    }

}