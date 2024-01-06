package org.example.A1_InteraktivQuiz;

public class Main {
    public static void main(String[] args){

        Quiz quiz = new Quiz();

        quiz.addQuizElement("Hvad er hovedstaden i Frankrig?", "Paris", "London");
        quiz.addQuizElement("Hvem skrev 'Romeo og Julie'?", "William Shakespeare", "Charles Dickens");
        quiz.addQuizElement("Hvad er verdens største ocean?", "Stillehavet", "Atlanterhavet");
        quiz.addQuizElement("Hvad er hovedingrediensen i sushi?", "Ris", "Pasta");
        quiz.addQuizElement("Hvad er Jordens største kontinent?", "Asien", "Europa");
        quiz.addQuizElement("Hvad er verdens højeste bjerg?", "Mount Everest", "Kilimanjaro");
        quiz.addQuizElement("Hvem malede Mona Lisa?", "Leonardo da Vinci", "Vincent van Gogh");
        quiz.addQuizElement("Hvad er hovedstaden i Japan?", "Tokyo", "Beijing");
        quiz.addQuizElement("Hvad er 2+2?", "4", "5");
        quiz.addQuizElement("Hvem opfandt tyngdekraften?", "Isaac Newton", "Albert Einstein");


        quiz.play();

    }
}
