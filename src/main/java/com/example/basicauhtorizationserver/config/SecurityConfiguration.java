package com.example.basicauhtorizationserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    //Create Bean of Security FilterChina for Web

    @Bean
    public SecurityFilterChain webSecurity(HttpSecurity http) throws Exception {




        return http.build();

    }


}
