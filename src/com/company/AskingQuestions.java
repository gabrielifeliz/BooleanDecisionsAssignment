package com.company;

import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        /* Since I am asked for integer numbers,
           I changed the datatype from double to int
        */
        int num1, num2, num3;

        System.out.print("First integer? ");
        num1 = keyboard.nextInt(); // Change method from nextString() to nextInt()

        System.out.print("Second integer? ");
        num2 = keyboard.nextInt();

        System.out.print("Third integer? ");
        num3 = keyboard.nextInt(); // Change method from nextDouble() to nextInt()

        /* To display the sum of the three numbers,
           I moved the line inside the main method block */
        System.out.println("The total is : " + (num1 + num2 + num3));
    }
}