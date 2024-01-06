package org.example.A1_InteraktivQuiz;

public class QuizElement {
    protected String question;
    protected String correctAnswer;
    protected String wrongAnswer;

    QuizElement(String question, String correctAnswer, String wrongAnswer){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswer = wrongAnswer;
    }

    boolean isCorrect(String response){
        return correctAnswer.equalsIgnoreCase(response);
    }

}
