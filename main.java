package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int eggsAmount;
        int eggsMin = 1;
        int milkAmount;
        int milkMin = 500; //mill
        int flourAmount;
        int flourMin = 100; //grams

        System.out.println("Hello Kostas");
        System.out.println("Grocery Calcutor starting up...");
        System.out.println("How many eggs do you have?");

        Scanner userInput;
        userInput = new Scanner(System.in);
        eggsAmount = userInput.nextInt();
        System.out.println("You have " + eggsAmount + " eggs.");
        //eggs done

        System.out.println("How much milk do you have?");
        userInput = new Scanner(System.in);
        milkAmount = userInput.nextInt();
        System.out.println("You have " + milkAmount + "mil. of milk.");

        System.out.println("How much flour do you have?");
        userInput = new Scanner(System.in);
        flourAmount = userInput.nextInt();
        System.out.println("You have " + flourAmount + "gr. of milk.");

        //main code here
        if (eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin) {
            System.out.println("Not enough things :(");
        }
    }
}
