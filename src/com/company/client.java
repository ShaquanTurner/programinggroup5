package com.company;
public class client {
    private int idNumber;
    private String fName;
    private String lName;
    private int age;
    private Card card;
    public client() {
    }
    public client(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.fName = firstName;
        this.lName = lastName;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public String getFirstName() {
        return fName;
    }
    public void setFirstName(String firstName) {
        this.fName = firstName;
    }
    public String getLastName() {
        return lName;
    }
    public void setLastName(String lastName) {
        this.lName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public void display() {
        System.out.println("ID Number: "+idNumber);
        System.out.println("First Name: "+fName);
        System.out.println("Last Name: "+lName);
        System.out.println("Age : "+age);
        card.display();
    }

}
