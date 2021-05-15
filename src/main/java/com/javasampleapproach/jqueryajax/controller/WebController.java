package com.javasampleapproach.jqueryajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class WebController {
	
    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }

    @GetMapping(value="/second")
    public String secondpage(){
        return "second";
    }

    @GetMapping(value="/third")
    public String thirdpage(){
        return "third";
    }

    @GetMapping(value="/fourth")
    public String fourthpage(){
        return "fourth";
    }

}