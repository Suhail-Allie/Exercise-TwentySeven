package org.example;

import java.util.Scanner;

public class Main {

    public static String sort(String s) {
        char[] chars = s.toCharArray();
        java.util.Arrays.sort(chars);    // Sort the char array
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to sort: ");
        String input = scanner.nextLine();  // Read user input

        String sortedString = sort(input);  // Sort the input string
        System.out.println("Sorted string: " + sortedString);  // Display the sorted string

        scanner.close();  // Close the scanner
    }
}