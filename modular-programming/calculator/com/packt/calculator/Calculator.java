package com.packt.calculator;

import java.util.Scanner;

public class Calculator {

    private static Integer acceptChoice(Scanner reader){
        System.out.println("************Advanced Calculator************");
        System.out.println("1. Prime Number check");
        System.out.println("2. Even Number check");
        System.out.println("3. Sum of N Primes");
        System.out.println("4. Sum of N Evens");
        System.out.println("5. Sum of N Odds");
        System.out.println("6. Exit");
        System.out.println("Enter the number to choose operation");
        return reader.nextInt();
    }
}
