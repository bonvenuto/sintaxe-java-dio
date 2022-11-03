package edu.angelo.anatomy;

public class MyClass{
        // MY CODE HERE - class MyClass
    public static void main (String [] args) {
        // Method main

        // Code for print a message
        System.out.println("Hello world!");

        //final doesn't accept any changes to the variables
        final String BR = "Brasil";
        //BR = "Brazil"; - returns error

        String firstName = "Ângelo";
        String lastName = "Bonvenuto";

        String nameComplete = nameComplete(firstName, lastName);

        System.out.println(nameComplete);

        int yearFabrication = 2022;

        boolean test = true;

        yearFabrication = 2018;

    }

    public static String nameComplete (String firstName, String lastName)
        {
           return firstName.concat(" ").concat(lastName);
        }
    }
