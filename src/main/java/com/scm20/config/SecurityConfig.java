package com.scm20.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {


    //user create and login using java code with in memory  service
    
    // @Bean
    // public UserDetailsService userDetailsService() {    
         
    //     UserDetails user1 =  User
    //     .withDefaultPasswordEncoder()
    //     .username("admin123")
    //     .password("admin123")
    //     .roles("ADMIN","USER")
    //     .build();

    //     UserDetails user2 = User
    //     .withDefaultPasswordEncoder()
    //     .username("admin1234")
    //     .password("admin1234")
    //     // .roles(null)
    //     .build();


    //     var  inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user1,user2);
    //     return  inMemoryUserDetailsManager;
    // }


    @Bean
    public DaoAuthenticationProvider authenticationProvider()
    {
         DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        
        daoAuthenticationProvider.setUserDetailsService(null);

        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());

        return daoAuthenticationProvider;

    }


    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
