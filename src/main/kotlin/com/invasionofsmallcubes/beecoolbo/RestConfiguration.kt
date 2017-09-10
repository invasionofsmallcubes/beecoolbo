package com.invasionofsmallcubes.beecoolbo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter
import org.springframework.http.MediaType.APPLICATION_JSON


@Configuration
internal class RestConfiguration {

    @Bean
    fun repositoryRestConfigurer(): RepositoryRestConfigurer {

        return object : RepositoryRestConfigurerAdapter() {

            override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
                config!!.defaultMediaType = APPLICATION_JSON
            }
        }
    }
}