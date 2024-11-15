package com.jonah.vttp5a_ssf_day02l.model;

public class Item {
    private String itemName;
    private Integer quantity;



    


    public Item(String itemName, Integer quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
}
