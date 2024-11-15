package com.jonah.vttp5a_ssf_day02l.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jonah.vttp5a_ssf_day02l.model.Item;
import com.jonah.vttp5a_ssf_day02l.service.ItemService;


@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService; //call the service layer

    @GetMapping("")
    public String cartItems(Model model){
        List<Item> items = itemService.getItems();
        model.addAttribute("items",items);
        return "cartlist";

    }


    @GetMapping("/filter") //this  is the url format
    public String filtercartItems(@RequestParam(name = "itemQuantity") String quantity, Model model){ //the name itemQUantity must be same as the GetMapping
        List<Item> items = itemService.getItems();
        //url is http://localhost:8080/items/filter?itemQuantity=3
        List<Item> filterItems = items.stream().filter(a -> a.getQuantity() > Integer.parseInt(quantity)).collect(Collectors.toList());

        model.addAttribute("items",filterItems); //the attributeName is the key, the filterItems is the value. The html looks at the key.
        return "cartlist";

    }
    
}
