package com.bytebodsquad.server

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.web.client.RestTemplate

@Configuration
class ApplicationTestConfig {

    @Value("\${server.port}")
    private val port = 0
    private var backendTestingURI = "http://localhost:$port/api"
    @Bean
    @Primary
    fun customTestRestTemplate(restTemplateBuilder: RestTemplateBuilder): RestTemplate {
        return restTemplateBuilder
            .rootUri(backendTestingURI)
            .build()
    }
}