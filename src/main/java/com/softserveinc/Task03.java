package com.softserveinc;

import java.util.Scanner;

/*
    Write a program that determines the minimum of a sequence positive numbers (the length of the sequence is not limited).

    The user should input the numbers until enter a zero or negative number.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    Enter the number after symbol >>>. To exit enter a zero.
    >>> 12
    >>> 75
    >>> 10
    >>> 9
    >>> 23
    >>> 0
    Minimum number is 9
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int min;
        System.out.print(">>> ");
        input = sc.nextInt();
        min = input;
        while (input != 0) {
            System.out.print(">>> ");
            input = sc.nextInt();
            if (input<min && input != 0) {
                min = input;
            }
        }
        if (min != 0) {
            System.out.println("Minimum number is " + min);
        }

    }
}