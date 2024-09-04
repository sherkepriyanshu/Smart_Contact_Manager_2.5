package com.scm20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm20.entities.User;
import com.scm20.forms.*;
import com.scm20.services.UserServices;
import com.scm20.services.impl.UserServiceImpl;

@Controller
public class PageController {

    @Autowired
    private UserServices userService;
    
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Print");
        model.addAttribute("name", "Priyanshu Sherke");
        model.addAttribute("youtubechannel", "Learn with durgesh");
        model.addAttribute("gitrepo", "https://chaicode.com/");

        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", false);
        System.out.println("about page loding");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services");
        return "services";
    }

    @RequestMapping("/contact")
    public String contactPage() {
        System.out.println("contact");
        return "contact";


    }
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }


    @GetMapping("/register")
    public String register(Model model) {
        System.out.println("about page loding");

        UserForm userForm = new UserForm();
        //default data bhi dal skate hai
        // userForm.setName("priyanshu");
        model.addAttribute("userForm", userForm);

        return "register";
    }

   

    @RequestMapping(value = "/do-register", method=RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm) {
        System.out.println("Processing registration");

        //fetch form data
        //userform
        System.out.println(userForm);
        //validate form data
        //save to database

        //userservices

        User user = User.builder()
        .name(userForm.getName())
        .email(userForm.getEmail())
        .password(userForm.getPassword())
        .phonenumber(userForm.getPhonenumber())
        .about(userForm.getAbout())
        .profilePic("not a image")
        .build();
        User saveUser = userService.saveUser(user);
        System.out.println("user saved");
        //message ="Registration succesful"
        //redirect to login page
        return "redirect:/register";
    } 
    
}
