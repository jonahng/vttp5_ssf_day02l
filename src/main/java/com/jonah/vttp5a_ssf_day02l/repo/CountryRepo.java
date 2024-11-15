package com.jonah.vttp5a_ssf_day02l.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jonah.vttp5a_ssf_day02l.model.Country;

@Repository
public class CountryRepo {
    List<Country> countryList = new ArrayList<>();


    public List<Country> getCountries(){


        Country cty = new Country("MY", "Malaysia", 100000);
        countryList.add(cty);
        cty = new Country("USA", "AMERICA", 200000);
        countryList.add(cty);

        return countryList;

    }


    public Boolean createCounty(Country cty){
        if (countryList == null){
            countryList = new ArrayList<>();
        }
        countryList.add(cty);
        return true;
    }
}
