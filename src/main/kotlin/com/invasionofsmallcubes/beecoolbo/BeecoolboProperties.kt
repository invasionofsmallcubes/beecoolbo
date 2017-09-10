package com.invasionofsmallcubes.beecoolbo;

import com.invasionofsmallcubes.beecoolbo.BeecoolboProperties.BeecoolEnv
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration


@Configuration
@EnableConfigurationProperties(value = BeecoolEnv::class)
class BeecoolboProperties {

    @ConfigurationProperties("becoolbo")
    class BeecoolEnv {
        var admin: String? = null
        var password: String? = null
    }
}
