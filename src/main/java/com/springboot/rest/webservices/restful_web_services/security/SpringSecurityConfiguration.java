package com.springboot.rest.webservices.restful_web_services.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // step 1: All requests should be authenticated

        http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );
        // step 2: If a request is not authenticated, a web page is shown
        http.httpBasic(Customizer.withDefaults());
        // step 3: CSRF -> Post, put method
        http.csrf(csrf -> csrf.disable());
        return http.build();
    }
}
