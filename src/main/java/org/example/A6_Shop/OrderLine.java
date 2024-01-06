package org.example.A6_Shop;

import java.util.ArrayList;

public class OrderLine {

    protected ArrayList<Item>item = new ArrayList<>();
    protected int amount;

    OrderLine(){

    }

    public int getTotalPrice(){
        int total = 0;
        for (Item item : item){
            total += item.price;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Item: " + item + " Amount: " + amount + " Total " + item + " price: " + getTotalPrice();
    }
}
