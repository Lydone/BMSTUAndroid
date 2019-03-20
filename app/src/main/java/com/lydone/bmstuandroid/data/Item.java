package com.lydone.bmstuandroid.data;

import java.util.List;

public class Item {

    public static List<Item> generateMenu() {
        // TODO
        throw new UnsupportedOperationException();
    }
    String name;
    int price;
    int weight;

    public Item(String name, int price, int weight){
        this.name=name;
        this.price=price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

}
