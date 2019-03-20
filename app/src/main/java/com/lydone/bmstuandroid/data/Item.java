package com.lydone.bmstuandroid.data;

import android.graphics.drawable.Drawable;

import com.lydone.bmstuandroid.R;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private Category category;
    private String name;
    private int price;
    private int weight;
    private int mDrawableId;

    public int getDrawableId() {
        return mDrawableId;
    }

    public Item(String name, int price, int weight, Category category, int drawableId) {     //Конструктор класса
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.category = category;
        this.mDrawableId = drawableId;
    }

    ;

    public static List<Item> generateMenu() {            //Генерируем заглушку
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Borsh", 200, 150, Category.Soup, R.drawable.r1));
        items.add(new Item("Chicken soup", 150, 150, Category.Soup, R.drawable.r2));
        items.add(new Item("Harcho", 250, 200, Category.Soup, R.drawable.r3));
        items.add(new Item("Rassolnik", 150, 150, Category.Soup, R.drawable.r4));
        items.add(new Item("Mushroom soup", 200, 200, Category.Soup, R.drawable.r5));
        items.add(new Item("Fried potatoes", 75, 150, Category.HotDish, R.drawable.r6));
        items.add(new Item("Beef", 300, 450, Category.HotDish, R.drawable.r7));
        items.add(new Item("Pork", 250, 500, Category.HotDish, R.drawable.r8));
        items.add(new Item("Fried chicken", 200, 350, Category.HotDish, R.drawable.r9));
        items.add(new Item("Spaghetti", 200, 300, Category.HotDish, R.drawable.r10));
        items.add(new Item("Water", 40, 60, Category.Drinks, R.drawable.r11));
        items.add(new Item("Juice(Apple/Orange/Grapes)", 50, 60, Category.Drinks, R.drawable.r12));
        items.add(new Item("Coke", 65, 75, Category.Drinks, R.drawable.r13));
        items.add(new Item("Beer", 80, 120, Category.Drinks, R.drawable.r14));
        items.add(new Item("Wine", 300, 500, Category.Drinks, R.drawable.r15));
        items.add(new Item("Ice cream", 75, 200, Category.Dessert, R.drawable.r16));
        items.add(new Item("Cheesecake", 120, 300, Category.Dessert, R.drawable.r17));
        items.add(new Item("Pancakes", 95, 200, Category.Dessert, R.drawable.r18));
        items.add(new Item("Potato chips", 120, 150, Category.Dessert, R.drawable.r19));
        items.add(new Item("Raspberry pie", 150, 300, Category.Dessert, R.drawable.r20));
        items.add(new Item("Cesar", 75, 100, Category.Salad, R.drawable.r21));
        items.add(new Item("Olive salad", 55, 85, Category.Salad, R.drawable.r22));
        items.add(new Item("Mushroom salad", 60, 90, Category.Salad, R.drawable.r23));
        items.add(new Item("Salad with Crab meat", 90, 115, Category.Salad, R.drawable.r24));
        items.add(new Item("Summer salad", 75, 120, Category.Salad, R.drawable.r25));
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