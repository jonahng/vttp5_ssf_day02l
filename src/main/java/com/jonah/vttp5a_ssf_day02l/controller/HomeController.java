package com.jonah.vttp5a_ssf_day02l.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller //must annotate it as a controller
@RequestMapping("/home") 
//this handles any url that starts with http://localhost:8080/home/...
public class HomeController {
    
/*     @GetMapping(path = {"","/landing"}) //getmapping says that it is a client getting info from server, rather than PostMapping
    public String home(){
        return "home"; //this will open home.html from templates. MUST BE THE SAME title as the html template.

    } */

    @GetMapping(path = {"","/landing"}) //getmapping says that it is a client getting info from server, rather than PostMapping
    public String home(Model model){
        model.addAttribute("currTime",(new Date()).toString());
        Calendar cal = Calendar.getInstance();
        model.addAttribute("currHour",cal.get(Calendar.HOUR_OF_DAY));//THE GET calendar.get FUNCTION will get an integer
        return "home"; //this will open home.html from templates. MUST BE THE SAME title as the html template.
        
    }
}
