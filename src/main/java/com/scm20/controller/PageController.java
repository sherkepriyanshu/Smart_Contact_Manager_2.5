package com.scm20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm20.forms.*;

@Controller
public class PageController {


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
    public String processRegister() {
        System.out.println("Processing registration");

        //fetch form data
        //userform

        //validate form data
        //save to database
        //message ="Registration succesful"
        //redirect to login page
        return "redirect:/register";
    } 
    
}
