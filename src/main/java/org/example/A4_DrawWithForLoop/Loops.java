package org.example.A4_DrawWithForLoop;

public class Loops {
    public void drawLeftTriangle(int size){
        for (int i = 1 ; i <= size ; i++){ // liner

            for (int j = 1; j <=  i  ; j++){ // brede
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void drawRightTriangle(int size){
        for (int i = 1 ; i <= size ; i++){
            // Print spaces
            for (int j = 1; j <= size - i; j++){
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}
