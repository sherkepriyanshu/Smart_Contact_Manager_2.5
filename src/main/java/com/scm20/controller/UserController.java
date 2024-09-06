package com.scm20.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserController {



        //add user dashboard

        @RequestMapping(value ="/dashboard", method=RequestMethod.GET)
        public String userDashboard() {
            return "user/dashboard";
        }
        
        // add profile page for user

        
        @RequestMapping(value ="/profile", method=RequestMethod.GET)
        public String userProfile() {
            return "user/profile";
        }
        
        //user add  contact

        //user edit contact


        // user delete contact


        
}
