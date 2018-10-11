package com.company;

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String arg[]){

        //Creating a new array
        ArrayList list = new ArrayList ();

        scanner(list);

        //After the scanner method, console outputs the list.
        System.out.println(list);
    }

    public static ArrayList scanner(ArrayList list){
        Scanner input = new Scanner(System.in);
        //Make a variable to hold the input


        String answer = "";
        String end = "DONE";

        System.out.println("Hello! Input is next line. Type 'DONE' to stop input.");
        answer = input.nextLine();


        System.out.println("----------------\nAdding "+ answer +" to list...\n");
        System.out.println("Thank you!");

        //Using an if statement to determine whether or not to pull the method again.


        if (!answer.equals(end)) {
            //If input doesn't equal 'DONE' then it adds it to the list.
            list.add(answer);
            scanner(list);
        }
        //Closing the Scanner so VSCode stops yelling at me.
        input.close();
        //For some reason it wasn't letting me get away with a return in the if statement.
        //So I had to put it in the method at the bottom.
        return(list);
    }
}