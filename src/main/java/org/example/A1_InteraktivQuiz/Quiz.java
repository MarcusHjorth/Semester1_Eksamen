package org.example.A1_InteraktivQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
    private final ArrayList<QuizElement>quizElements = new ArrayList<>();
    private int points = 0;

    public void addQuizElement(String question, String correctAnswer, String wrongAnswer){
        quizElements.add(new QuizElement(question, correctAnswer, wrongAnswer));
    }

    public void askQuestion(){
        Scanner scan = new Scanner(System.in);

        for (int i = 0 ; i < quizElements.size(); i++){
            ArrayList<String> answers = new ArrayList<>();
            answers.add(quizElements.get(i).correctAnswer);
            answers.add(quizElements.get(i).wrongAnswer);

            Collections.shuffle(answers);

            System.out.println(quizElements.get(i).question + " ");
            for (int j = 0; j < answers.size(); j++) {
                System.out.println((j + 1) + ". " + answers.get(j) + " ");
            }
            System.out.println(" ");
            String response = scan.nextLine();

            System.out.println(quizElements.get(i).isCorrect(response));
            if (quizElements.get(i).isCorrect(response)){
                points++;
            }
            System.out.println("Your points: " + points);
            System.out.println(" ");
        }
        System.out.println("You got " + points + " questions right out of " + quizElements.size());
    }

    public void play(){
        askQuestion();
    }
}


