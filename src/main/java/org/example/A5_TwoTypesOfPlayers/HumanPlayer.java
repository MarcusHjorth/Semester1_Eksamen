package org.example.A5_TwoTypesOfPlayers;


import java.util.Scanner;

public class HumanPlayer implements Player {


    public int makeAGuess(int maxValue){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and " + maxValue);

        return scan.nextInt();
    }
}
