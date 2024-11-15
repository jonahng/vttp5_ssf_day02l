package com.jonah.vttp5a_ssf_day02l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
}
