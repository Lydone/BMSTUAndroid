package com.lydone.bmstuandroid.data;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private Category category;
    private String name;
    private int price;
    private int weight;

    public Item(String name, int price, int weight, Item.Category category) {     //Конструктор класса
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.category = category;
    }

    ;

    public static List<Item> generateMenu() {            //Генерируем заглушку
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Borsh", 200, 150, Category.Soup));
        items.add(new Item("Chicken soup", 150, 150, Category.Soup));
        items.add(new Item("Harcho", 250, 200, Category.Soup));
        items.add(new Item("Rassolnik", 150, 150, Category.Soup));
        items.add(new Item("Mushroom soup", 200, 200, Category.Soup));
        items.add(new Item("Fried potatoes", 75, 150, Category.HotDish));
        items.add(new Item("Beef", 300, 450, Category.HotDish));
        items.add(new Item("Pork", 250, 500, Category.HotDish));
        items.add(new Item("Fried chicken", 200, 350, Category.HotDish));
        items.add(new Item("Spaghetti", 200, 300, Category.HotDish));
        items.add(new Item("Water", 40, 60, Category.Drinks));
        items.add(new Item("Juise(Apple/Orange/Grapes)", 50, 60, Category.Drinks));
        items.add(new Item("Coke", 65, 75, Category.Drinks));
        items.add(new Item("Beer", 80, 120, Category.Drinks));
        items.add(new Item("Wine", 300, 500, Category.Drinks));
        items.add(new Item("Ice cream", 75, 200, Category.Dessert));
        items.add(new Item("Cheesecake", 120, 300, Category.Dessert));
        items.add(new Item("Pancakes", 95, 200, Category.Dessert));
        items.add(new Item("Potato chips", 120, 150, Category.Dessert));
        items.add(new Item("Raspberry pie", 150, 300, Category.Dessert));
        items.add(new Item("Cesar", 75, 100, Category.Salad));
        items.add(new Item("Olive salat", 55, 85, Category.Salad));
        items.add(new Item("Mushroom salat", 60, 90, Category.Salad));
        items.add(new Item("Salat with Crab meat", 90, 115, Category.Salad));
        items.add(new Item("Summer salat", 75, 120, Category.Salad));
        return items;
    }

    public int getPrice() {                      //Методы для возвращения полей класса
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Category GetEnum() {
        return category;
    }

    enum Category {
        HotDish, Soup, Drinks, Dessert, Salad
    }

}