package me.fortibrine.springsample.config

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

class MySpringMvcDispatcherServletInitializer: AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun getRootConfigClasses(): Array<Class<*>>? {
        return null
    }

    override fun getServletConfigClasses(): Array<Class<*>>? {
        return arrayOf(SpringConfig::class.java)
    }
}