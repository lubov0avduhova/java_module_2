package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");

        while (!sc.hasNextInt()) {
            System.out.println("This not a number.");
            String bb = sc.next();
            System.out.println(bb);
        }

        int number1 = sc.nextInt();

        System.out.println("You have entered: " + number1);
    }
}