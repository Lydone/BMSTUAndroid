package com.lydone.bmstuandroid.data;

public class Item {

    String name;
    int price;
    int weight;

    public Item(String nam, int price, int gramm){
        name=nam;
        this.price=price;
        weight=gramm;
    }

    @Override
    public String ToString(){
        return "Наименование: " + name + " Цена: " + price + " вес: " + weight + "гр."
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
