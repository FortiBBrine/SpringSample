package me.fortibrine.springsample.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.persistence.EntityManagerFactory

@Configuration
@EnableJpaRepositories(basePackages = ["me.fortibrine.springsample"])
@EnableTransactionManagement
open class JpaConfig {
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
}