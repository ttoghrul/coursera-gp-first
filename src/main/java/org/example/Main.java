package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        while(true) {
            char operator;
            double number1, number2;
            // ask users to enter operator
            System.out.println("Choose an operator: +, -, *, / or X to stop application");
            operator = input.next().charAt(0);

            // ask users to enter numbers
            System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();

            Calculator.calculate(operator, number1, number2);
            input.close();
        }
    }
}