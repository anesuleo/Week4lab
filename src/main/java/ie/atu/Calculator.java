package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello");
        add();
    }

    public static void add()
    {
        System.out.println("Print your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Print your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }
}

