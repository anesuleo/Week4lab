package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello");
        add();
        multiply();
        divide();
        subtraction();
    }

    public static void add() {
        System.out.println("Print your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Print your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }

    public static void multiply() {
        System.out.println("\nNext is Multiplication...\n");
        System.out.println("Print your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Print your second number :");
        int secondNumber = inputs.nextInt();

        int multiply = firstNumber * secondNumber;
        System.out.println("The product is " + multiply);
    }

    public static void divide() {
        System.out.println("\nNext is Division...\n");
        System.out.println("Print the dividend : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Print the divisor :");
        int secondNumber = inputs.nextInt();

        int quotient = firstNumber / secondNumber;
        System.out.println("The answer is " + quotient);
    }

    public static void subtraction()
    {
        System.out.println("\nNext is Subtraction...");
        System.out.println("Print your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Print your second number :");
        int secondNumber = inputs.nextInt();

        int subtract = firstNumber - secondNumber;
        System.out.println("The difference is " + subtract);
    }
}




