package org.example.A6_Shop;

import java.util.ArrayList;

public class OrderLine {
    protected Item item;
    protected int amount;

    OrderLine(Item item, int amount){
        this.item = item;
        this.amount = amount;
    }

    public int getTotalPrice(){
        return item.price * amount;
    }

    @Override
    public String toString() {
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
        return  "Item- " + item + " Amount: " + GREEN + amount + RESET + " TotalPrice: " + GREEN + getTotalPrice() + RESET;
    }
}
