package com.example.fridaychallenge4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }
    @RequestMapping("/git")
    public String gitPage(){
        return "git";
    }
    @RequestMapping("/design")
    public String designPage(){
        return "design";
    }
    @RequestMapping("/java")
    public String javaPage(){
        return "java";
    }
    @RequestMapping("/oop")
    public String oopPage(){
        return "oop";
    }
    @RequestMapping("/cssboot")
    public String cssbootPage(){
        return "cssboot";
    }
    @RequestMapping("/bootcamp")
    public String bootcampPage(){
        return "bootcamp";
    }
    @RequestMapping("/pdesign")
    public String pDesign(){
        return "pdesign";
    }
}
