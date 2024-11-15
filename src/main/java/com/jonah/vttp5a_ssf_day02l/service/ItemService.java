package com.jonah.vttp5a_ssf_day02l.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonah.vttp5a_ssf_day02l.model.Item;
import com.jonah.vttp5a_ssf_day02l.repo.itemRepo;

//Logic done in Service layer, like checking age above certain value

@Service
public class ItemService {
    @Autowired //Auto instantiate the objects, otherwise would need an ItemService Constructor e.g ItemService(){itemRepo = new ItemRepo()}
    

    itemRepo itemRepo;

    public List<Item> getItems(){
        return itemRepo.getItems();
    }
}
