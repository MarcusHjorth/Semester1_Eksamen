package org.example.A6_Shop;

public class Main {
    public static void main(String[] args) {

        Item totato = new Item("Tomato", 5);
        Item chicken = new Item("Chicken", 45);
        Item pasta = new Item("Pasta", 10);

        OrderLine orderLineTomatos = new OrderLine(totato, 10);
        OrderLine orderLineChicken = new OrderLine(chicken, 2);
        OrderLine orderLinePasta = new OrderLine(pasta, 3);

        System.out.println(orderLineTomatos);
        System.out.println(orderLineChicken);
        System.out.println(orderLinePasta);

        System.out.println();

        Order order = new Order();
        order.addOrderLine(orderLineTomatos);
        order.addOrderLine(orderLineChicken);
        order.addOrderLine(orderLinePasta);

        System.out.println(order);
    }
}