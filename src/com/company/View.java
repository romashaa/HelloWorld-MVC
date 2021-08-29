package com.company;

public class View {
    // Text's constants
    public static final String INPUT_TEXT_DATA = "Input text = ";
    public static final String WRONG_INPUT_TEXT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_TEXT = "Greeting: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndText(String message, String text){
        System.out.println(message + text);
    }

}
