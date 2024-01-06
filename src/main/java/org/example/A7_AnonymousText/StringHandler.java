package org.example.A7_AnonymousText;

public class StringHandler {


    public String replaceText(String text, String[] names){
        for (String name: names){

            text = text.replace(name, "Den studerende");
        }
        return text;
    }
}
