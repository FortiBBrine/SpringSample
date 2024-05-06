package me.fortibrine.springsample.config

import org.springframework.web.filter.HiddenHttpMethodFilter
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer
import javax.servlet.ServletContext

class MySpringMvcDispatcherServletInitializer: AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun getRootConfigClasses(): Array<Class<*>>? {
        return null
    }

    override fun onStartup(servletContext: ServletContext) {
        super.onStartup(servletContext)
        registerHiddenFieldFilter(servletContext)
    }

    private fun registerHiddenFieldFilter(aContext: ServletContext) {
        aContext.addFilter(
            "hiddenHttpMethodFilter",
            HiddenHttpMethodFilter()
        ).addMappingForUrlPatterns(null, true, "/*")
    }

    override fun getServletConfigClasses(): Array<Class<*>> {
        return arrayOf(
            SpringConfig::class.java,
            JpaConfig::class.java
        )
    }
}