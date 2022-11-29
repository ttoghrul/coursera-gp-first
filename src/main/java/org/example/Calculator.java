package org.example;

import java.util.Scanner;

public class Calculator {

    public static void calculate(char operator, double number1, double number2) {
        double result;
        switch (operator) {

            // performs addition between numbers
            case '+' -> {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }

            // performs subtraction between numbers
            case '-' -> {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }

            // performs multiplication between numbers
            case '*' -> {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            }

            // performs division between numbers
            case '/' -> {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }

            // stop the application
            case 'X' -> {
                result = number1 * number2;
            }

            case '%' -> {
                result = number1 % number2;
                //blbl
            }
            
            // stop the application
            case '^' -> {
                System.out.println("Invalid operator!");
            }
            default -> System.out.println("Valid perv!");
        }
    }
}
