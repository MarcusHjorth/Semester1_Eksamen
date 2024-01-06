package org.example.A5_TwoTypesOfPlayers;
import java.util.Random;

public class ComputerPlayer implements Player {

    public int makeAGuess(int maxValue){
        Random random = new Random();
        return random.nextInt(1, maxValue +1);
    }
}
