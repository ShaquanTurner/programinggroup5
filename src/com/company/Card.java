package com.company;
public class Card {
    private int cNumber;
    private double balance;
    private int pin;
    private boolean sta;
    public Card() {
        super();
    }
    public Card(int cardNumber, double balance, int pin, boolean status) {
        this.cNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.sta = status;
    }
    public static Card createCard(int cardNumber, double balance, int pin, boolean status) {
        return new Card(cardNumber, balance, pin, status);
    }
    public int getCardNumber() {
        return cNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cNumber = cardNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public boolean isStatus() {
        return sta;
    }
    public void setStatus(boolean status) {
        this.sta = status;
    }
    public void display() {
        System.out.println("Card Number: "+cNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Pin: "+pin);
        System.out.println("Status: "+sta);
    }
}


