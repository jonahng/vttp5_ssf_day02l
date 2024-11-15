package com.jonah.vttp5a_ssf_day02l.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jonah.vttp5a_ssf_day02l.model.Country;
import com.jonah.vttp5a_ssf_day02l.service.CountryService;

@Controller
@RequestMapping("/countries")


public class CountryController {
    @Autowired
    CountryService countryService;

    //@ResponseBody //This will send the data back to the data without using html
    @GetMapping("")
    public String countriesList(Model model){
        List<Country> countries = countryService.getCountries();
        model.addAttribute("countries",countries);
            return "countrylist";
        
        
    }

    @GetMapping("/filter")
    public String filterCountries(@RequestParam(name = "population") String populationFilter, Model model){
        List<Country> countries = countryService.getCountries();
        List<Country> filteredCountries = countries.stream().filter(a -> a.getPopulation() > Integer.parseInt(populationFilter)).collect(Collectors.toList());
        model.addAttribute("countries",filteredCountries);

        return "countrylist";
    }
    
}
