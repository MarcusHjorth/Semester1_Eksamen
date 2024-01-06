package org.example.A6_Shop;

import java.util.ArrayList;

public class Order {
    protected ArrayList<OrderLine> orderLines;

    public int getTotalPrice(){
        int total = 0;
        for (OrderLine orderLine : orderLines){
            total += orderLine.getTotalPrice();
        }
        return total;
    }

    public void addOrderLine(){

    }

    @Override
    public String toString() {
        return "OrderLines=" + orderLines ;
    }
}
