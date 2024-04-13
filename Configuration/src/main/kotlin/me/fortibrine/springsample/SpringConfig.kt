package me.fortibrine.springsample

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan("me.fortibrine.springsample")
@PropertySource("classpath:musicPlayer.properties")
open class SpringConfig {
//
//    @Bean
//    open fun classicalMusic() = ClassicalMusic()
//
//    @Bean
//    open fun rockMusic() = RockMusic()
//
//    @Bean
//    open fun musicPlayer() = MusicPlayer(rockMusic(), classicalMusic())
//
//    @Bean
//    open fun computer() = Computer(musicPlayer())

}