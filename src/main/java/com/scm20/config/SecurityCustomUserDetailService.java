package com.scm20.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.scm20.repository.UserRepo;

public class SecurityCustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //apne user ok load karna hai
        return userRepo.findByEmail(username).orElseThrow(() ->new UsernameNotFoundException("USER not found"));
    }

}
