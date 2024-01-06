package org.example.A9_MultipeConstructors;

public class User {

    private String name;
    private String password;
    private String email;
    private int phoneNumber;
    User(String name, String password, String email, int phoneNumber){
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    User(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }
    User(String name, String password){
        this.name = name;
        this.password = password;
    }

    // ----- getters

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // ----- setters


    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Name: ").append(name);
        builder.append(" Password: ").append(password);

        if (email != null){
            builder.append(" Email: ").append(email);
        }

        int phoneNumberLength = String.valueOf(phoneNumber).length();
        if (phoneNumberLength == 8 ){
            builder.append(" PhoneNumber: ").append(phoneNumber);
        }
        return builder.toString();
    }
}
