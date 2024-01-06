package org.example.A10_BuyFlowers;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {
    private final ArrayList<String>flowers = new ArrayList<>();
    private int total;
    FlowerShop(){
        flowers.add("rose");
        flowers.add("tulip");
        flowers.add("sunflower");
        flowers.add("daisy");
        flowers.add("orchid");
        flowers.add("lily");
        flowers.add("daffodil");
        flowers.add("peony");
        flowers.add("hydrangea");
        flowers.add("iris");
    }

    public void displayFlowers(){
        System.out.println("Flower Shop:");
        for (String flower : flowers){
            System.out.print( " \t " + flower);
        }
        System.out.println();
    }

    public void runDialog(){
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.println("Select 3 flowers would you would like");
        for (int i = 1 ; i <= 3 ; i++){
            System.out.println("Which flower would you like for your " + i + ".");
            String input = scan.nextLine();
            System.out.println(flowers.indexOf(input));

            System.out.println("Total: " + checkFlowerIndex(input));
            System.out.println();
        }

        System.out.println("Would you like it as a bouquet? y/n");
        String input = scan.nextLine();

        if(input.equalsIgnoreCase("Y")){
            total += 50;
        } // --------------------------------- hvis ekstra tid finpus så den siger fejl ved andre indtastninger
        System.out.println("Total: " + total);
        System.out.println();
    }

    public int checkFlowerIndex(String input){
        if (flowers.indexOf(input) + 1 <= 4 ){
            total += 20;
        } else if (flowers.indexOf(input) + 1 > 4 && flowers.indexOf(input) + 1 <= 7 ) {
            total += 40;
        } else if (flowers.indexOf(input) + 1 > 7 && flowers.indexOf(input) + 1 <= 10 ) {
            total += 80;
        } else System.out.println("The flower is not in the system");
        return total;
    }
}
