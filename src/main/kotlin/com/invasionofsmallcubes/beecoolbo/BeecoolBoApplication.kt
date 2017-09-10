package com.invasionofsmallcubes.beecoolbo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

@SpringBootApplication
class BeecoolBoApplication

fun main(args: Array<String>) {
    SpringApplication.run(BeecoolBoApplication::class.java, *args)
}
