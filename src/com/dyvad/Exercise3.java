package com.dyvad;

public class Exercise3 {

    public static void main(String[] args){
        //The U.S. Census Bureau projects population based on the following assumption:
        //One birth happens every 7 seconds
        //One death happens every 13 seconds
        //The population of the USA is currently: 331,002,651
        //Write a program that calculates how the US population are projected
        //to be in 5 years. Print the growth & sum

        int currentPop = 331002651;

        double birthPrMinute = 60.0/7.0;
        double deathPrMinute = 60.0/13.0;
        double birthPr5Year = ((((birthPrMinute) * 60.0) * 24.0) * 365.0) * 5.0;
        double deathPr5Year = ((((deathPrMinute) * 60.0) * 24.0) * 365.0) * 5.0;
        double increase = (int)birthPr5Year - (int)deathPr5Year;

        System.out.println("Hvor mange nyfødte der bliver født i USA per 5 år: " + (int)birthPr5Year);
        System.out.println("Hvor mange der dør i USA per 5 år: " + (int)deathPr5Year);

        System.out.println("Hvor mange der bliver født ift. hvor mange der dør per 5 år: " + (int)increase);

        double popInFiveYears = (currentPop + (int)birthPr5Year - (int)deathPr5Year);

        System.out.println("Dette er populationen i USA om 5 år: " + (int)popInFiveYears);
    }
}
