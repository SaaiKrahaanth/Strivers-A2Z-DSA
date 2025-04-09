package Lec1_ThingsToKnowInProgramming;

// This is a Java program to demonstrate user input and output
import java.util.Scanner;

public class _01_UserInputOutput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // Ask the user for their name
        System.out.print("Enter your name: ");
        // Read the user's input and store it in a String variable
        String userName = scanner.nextLine();
        // Close the Scanner object to release resources
        scanner.close();
        // Print a greeting message with the user's name
        System.out.println("Hello, " + userName + "! How are you today?");
        
    }
    
}
