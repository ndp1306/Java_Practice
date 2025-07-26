package Java_Practice;

import java.util.Scanner;

public class Day_1 {
    public static void main(String[] args){ // entry point of every Java application
        // public -> Accessible from anywhere
        // static -> Belongs to the class, not an object (research)
        // void -> Doesn't return any value
        // main -> Method name
        // String[] args: Command -line arguments
        // System.out.println("hello");
        // System - built-in class
        // out - Object of PrintStream class
         // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + " hehe");

        scanner.close();
    }
}
