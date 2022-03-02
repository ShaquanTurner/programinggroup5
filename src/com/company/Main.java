package com.company;
//ChevonMcIntosh 2017001610 //Shaquan Turner 1817001436 //Jahvaughn Binns 2017001833
import java.util.Scanner;public class Main {public static void main(String[] args) {Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Your Identification Number: ");
    int idNumber = myObj.nextInt();
    System.out.println("Enter Your First Name");
    String firstName = myObj.next();
    System.out.println("Enter Your Last Name");
    String lastName = myObj.next();
    System.out.println("Enter Your Age: ");
    int age = myObj.nextInt();
    System.out.println("Enter Your Card Number: ");
    int cardNumber = myObj.nextInt();
    System.out.println("Enter Your Balance: ");
    double balance = myObj.nextDouble();
    System.out.println("Enter PIN: ");
    int pin = myObj.nextInt();
    System.out.println("Enter Status: ");
    boolean status = myObj.nextBoolean();
    client obj1 = new client(idNumber, firstName, lastName);
    obj1.setAge(age);
    Card card = Card.createCard(cardNumber, balance, pin, status);
    obj1.setCard(card);
    obj1.display();
    obj1.getCard().display();
    obj1.getCard().setStatus(true);
    obj1.getCard().setCardNumber(45678);
}}