package org.example.A6_Shop;

import java.util.ArrayList;

public class Order {

    OrderLine orderLine;
    protected ArrayList<OrderLine> orderLinesArray = new ArrayList<>();


    public void addOrderLine(OrderLine orderLine){
        orderLinesArray.add(orderLine);
    }

    public int getTotalPrice(){
        int total = 0;
        for (OrderLine orderLine : orderLinesArray) {
            total += orderLine.getTotalPrice();
        } return total;
    }

    @Override
    public String toString() {
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
        return "Order- " + orderLinesArray + "\n TotalPrice: " + GREEN + getTotalPrice() + RESET;
    }
}
