package com.jonah.vttp5a_ssf_day02l.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    //QUERY STRING
    @GetMapping("")
    public String weather(@RequestParam(required = true, name = "country", defaultValue = "Singapore") String city,
     @RequestParam(name = "metrics", defaultValue = "centimeters") String metric, Model model){
        model.addAttribute("city", city);
        model.addAttribute("metrics", metric);
        return "weather";

    }



    //this uses Path variable
    //http://localhost:8080/weather/{city}/{metrics}
    @GetMapping("/city/{country}/metrics/{metrics}") //curly brackets are the placeholder
    public String weather2(@PathVariable(required = true, name = "country") String city,
     @PathVariable(name = "metrics") String metric, Model model){
        model.addAttribute("city", city);
        model.addAttribute("metrics", metric);
        return "weather";
        
    }

}
