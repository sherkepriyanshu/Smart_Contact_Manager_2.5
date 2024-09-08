package com.scm20.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {


    //user create and login using java code with in memory  service
    private InMemoryUserDetailsManager inMemoryUserDetailsManager;
    @Bean
    public UserDetailsService userDetailsService() {    
        
        var  inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
        return  inMemoryUserDetailsManager;
    }
}
