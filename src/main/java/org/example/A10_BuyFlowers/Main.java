package org.example.A10_BuyFlowers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FlowerShop flowerShop = new FlowerShop();


        Scanner scan = new Scanner(System.in);

        String input;

        do {
            flowerShop.displayFlowers();
            flowerShop.runDialog();

            System.out.println("Would you like to continue, press any button, if not press 'Q' ");
            input = scan.nextLine();
            System.out.println();
       }while (!input.equalsIgnoreCase("q"));
    }
}