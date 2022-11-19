package com.consol.citrus;

import com.consol.citrus.http.client.HttpClient;
import com.consol.citrus.http.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class MyConfig {

    @Bean
    public HttpClient starwarsClient() {
        System.out.println("Client is created");
        return new HttpClientBuilder()
                .requestUrl("https://swapi.dev/api/")
                .requestMethod(HttpMethod.GET)
                .contentType("application/json")
                .charset("UTF-8")
                .timeout(60000L)
                .build();
    }
}
