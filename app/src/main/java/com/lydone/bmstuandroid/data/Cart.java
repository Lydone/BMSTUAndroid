package com.lydone.bmstuandroid.data;

import java.util.ArrayList;

public class Cart {

    ArrayList<Item> items = new ArrayList<Item>();

    public int GetSum(){

        int sum=0;

        for (Item it: items) {
            sum+=it.getPrice();
        }
        return sum;
    }

    public void AddToCart(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Cart(Item[] NewItems){
        for (Item it: NewItems) {
            items.add(it);
        }
    }

    public Cart(){

    }

}
