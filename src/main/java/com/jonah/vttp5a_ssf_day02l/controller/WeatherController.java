package com.jonah.vttp5a_ssf_day02l.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jonah.vttp5a_ssf_day02l.model.Country;
import com.jonah.vttp5a_ssf_day02l.service.CountryService;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    CountryService countryService;

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



    @GetMapping("/pagea")
    public String pageA(Model model){
        String [] units = {"mm","centimeter","m","kilometer"};
        List<Country> countries = countryService.getCountries();

        model.addAttribute("countries",countries);
        model.addAttribute("metrics", units);

        return "pagea";

    }


    @GetMapping("/forma")
    public String showForm(){
        return "forma";
    }


    @PostMapping("/forma")
    public String handleFormA(@RequestBody MultiValueMap<String, String> form){
        Map<String, String> formData = new HashMap<>(); 
        for(String str: form.keySet()){
            formData.put(str, form.getFirst(str)); //THis lets us retrieve the data that was posted by the form;
            System.out.println("form data:" + str + ": " + form.getFirst(str));
        }

        return "forma";


    }

}
