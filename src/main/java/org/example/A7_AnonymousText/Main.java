package org.example.A7_AnonymousText;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Katrine", "Anders"};

        StringHandler text = new StringHandler();
        System.out.println(text.replaceText("Katrine trak sit spørgsmål kl.10. Katrine fik karakteren 7. Anders trak sit spørgsmål kl. 11. Anders fik karakteren 4", names));
    }
}