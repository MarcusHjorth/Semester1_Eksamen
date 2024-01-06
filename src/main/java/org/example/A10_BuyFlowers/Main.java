package org.example.A10_BuyFlowers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FlowerShop flowerShop = new FlowerShop();


        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Would you like to continue, press any button, if not press 'Q' ");
        System.out.println();

        while (!input.equalsIgnoreCase("q")){
            flowerShop.displayFlowers();
            flowerShop.runDialog();
       }
    }
}