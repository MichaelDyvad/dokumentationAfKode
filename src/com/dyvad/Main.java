package com.dyvad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Write a program that prompts the user to enter their personal info:
        //Name, age,height, occupation. Print out their personal info

        //Laver scanner
        Scanner info = new Scanner(System.in);

        //Linje 15-25 promter useren og får input
        System.out.print("Enter your name here: ");
        String name = info.nextLine();

        System.out.print("What is your occupation: ");
        String occupation = info.nextLine();

        System.out.print("Enter your age here: ");
        int age = info.nextInt();

        System.out.print("Enter your height in meters here: ");
        double height = info.nextDouble();

        //Output til useren
        System.out.println("Your name is: " + name);
        System.out.println("Your occupation is: " + occupation);
        System.out.println("You are: " + age + " years old");
        System.out.println("You are " + height + " meters tall");



    }
}
