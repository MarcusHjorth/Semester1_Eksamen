package org.example.A6_Shop;

public class Item {
    protected String name;
    protected int price;

    Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + "Price: " + price;
    }
}
