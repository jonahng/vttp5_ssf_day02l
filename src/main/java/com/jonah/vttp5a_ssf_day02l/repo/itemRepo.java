package com.jonah.vttp5a_ssf_day02l.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jonah.vttp5a_ssf_day02l.model.Item;

@Repository
public class itemRepo {
    private List<Item> itemList = new ArrayList<>();
    public List<Item> getItems(){
        Item itm = new Item("Apple m4", 5);
        itemList.add(itm);

        itm = new Item("acer probook", 2);
        itemList.add(itm);

        itm = new Item("banana", 4);
        itemList.add(itm);

        itm = new Item("Aquafir", 12);
        itemList.add(itm);

        itm = new Item("racecar", 29);
        itemList.add(itm);

        System.out.println(itemList);

        return itemList;

        
    }
}
