package org.example.A9_MultipeConstructors;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Chad", "1234", "Chad123@gmail.com", 22334455);
        User user2 = new User("Chad", "1234", "Chad123@gmail.com");
        User user3 = new User("Chad", "1234");

        System.out.println(user1);
        System.out.println();

        System.out.println(user2);
        System.out.println();

        System.out.println(user3);



    }
}