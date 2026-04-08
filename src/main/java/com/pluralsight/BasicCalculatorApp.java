package com.pluralsight;


import java.util.Arrays;
import java.util.Scanner;

public class BasicCalculatorApp {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter the second number: ");
        int num2 = keyboard.nextInt();
        keyboard.nextLine();


    }
}
