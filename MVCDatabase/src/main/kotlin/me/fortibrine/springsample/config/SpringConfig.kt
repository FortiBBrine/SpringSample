package me.fortibrine.springsample.config

import javax.persistence.EntityManagerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.thymeleaf.spring5.SpringTemplateEngine
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver
import org.thymeleaf.spring5.view.ThymeleafViewResolver

@Configuration
@ComponentScan("me.fortibrine.springsample")
@EnableWebMvc
@EnableJpaRepositories(basePackages = ["me.fortibrine.springsample"])
@EnableTransactionManagement
open class SpringConfig @Autowired constructor(
    private val applicationContext: ApplicationContext
): WebMvcConfigurer {

    @Bean
    open fun entityManagerFactory(): LocalEntityManagerFactoryBean {
        val factoryBean = LocalEntityManagerFactoryBean()
        factoryBean.persistenceUnitName = "SalesDB"

        return factoryBean
    }

    @Bean
    open fun transactionManager(entityManagerFactory: EntityManagerFactory): JpaTransactionManager {
        val transactionManager = JpaTransactionManager()

        transactionManager.entityManagerFactory = entityManagerFactory

        return transactionManager
    }

    @Bean
    open fun templateResolver(): SpringResourceTemplateResolver {
        val templateResolver = SpringResourceTemplateResolver()
        templateResolver.setApplicationContext(applicationContext)
        templateResolver.prefix = "/WEB-INF/views/"
        templateResolver.suffix = ".html"
        return templateResolver
    }

    @Bean
    open fun templateEngine(): SpringTemplateEngine {
        val templateEngine = SpringTemplateEngine()
        templateEngine.setTemplateResolver(templateResolver())
        templateEngine.enableSpringELCompiler = true
        return templateEngine
    }

    override fun configureViewResolvers(registry: ViewResolverRegistry) {
        val resolver = ThymeleafViewResolver()
        resolver.templateEngine = templateEngine()
        registry.viewResolver(resolver)
    }
}