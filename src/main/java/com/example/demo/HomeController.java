package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   /*401*/
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /*402*/
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    /*403*/
    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
}