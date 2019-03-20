package com.lydone.bmstuandroid.data;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items = new ArrayList<Item>();

    public Cart(Item[] NewItems) {
        for (Item it : NewItems) {
            items.add(it);
        }
    }

    public Cart() {

    }

    public int GetSum() {
        int sum = 0;
        for (Item it : items) {
            sum += it.getPrice();
        }
        return sum;
    }

    public void AddToCart(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

}
