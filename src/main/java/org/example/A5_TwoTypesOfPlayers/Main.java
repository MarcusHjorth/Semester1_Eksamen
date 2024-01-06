package org.example.A5_TwoTypesOfPlayers;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int maxValue = 3;
        Random random = new Random();
        int correctAnswer = random.nextInt(1, maxValue + 1);
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();


        int humanGuess = humanPlayer.makeAGuess(maxValue);
        System.out.println("Human guessed: " + humanGuess);
        int computerGuess = computerPlayer.makeAGuess(maxValue);
        System.out.println("Computer guessed: " + computerGuess);


        System.out.println("Correct answer is: " + correctAnswer);
        System.out.println();

        if (humanGuess == correctAnswer || computerGuess == correctAnswer){
            if (humanGuess == correctAnswer && computerGuess == correctAnswer){
                System.out.println("Both human and the computer guessed correct! 🤩");
            }
            else if ( humanGuess == correctAnswer){
                System.out.println("Human guessed correct!🤩");
            }
            else if ( computerGuess == correctAnswer){
                System.out.println("Computer guessed correct!🤩");
            }
        } else {
            System.out.println("Both guesses were wrong 😣");
        }
    }
}
