package me.fortibrine.springsample

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    val bean = context.getBean("testBean", TestBean::class.java) as TestBean
    println(bean.name)
    context.close()
}