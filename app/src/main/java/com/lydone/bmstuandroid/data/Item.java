package com.lydone.bmstuandroid.data;

public class Item {

    string name;
    int price;
    int weight;

    public Item(string nam, int price, int gramm){
        name=nam;
        this.price=price;
        weight=gramm;
    }

    @Override
    public string ToString(){
        return "Наименование: " + name + " Цена: " + price + " вес: " + weight + "гр."
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public string getName() {
        return name;
    }

}
