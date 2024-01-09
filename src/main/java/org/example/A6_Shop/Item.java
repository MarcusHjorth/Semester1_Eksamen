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
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
        return "Name: " + GREEN + name + RESET + " Price: " + GREEN + price + RESET;
    }
}
