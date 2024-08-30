package com.scm20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home() 
    {
        System.out.println("Print");
        // model.addAttribute("name","Priyanshu Sherke");
        // model.addAttribute("youtubechannel","Learn with durgesh");
        // model.addAttribute("gitrepo","https://chaicode.com/");
        
        return "home";
    }

    @RequestMapping("/about1")
    public String aboutPage()
    {
        // model.addAttribute("isLogin", false);
        System.out.println("about page loding");
        return "about";
    }

    @RequestMapping("/services1")
    public String servicesPage()
    {
        System.out.println("services");
        return "services";
    }
}
