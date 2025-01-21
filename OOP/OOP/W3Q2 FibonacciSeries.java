// File Name: FibonacciSeries.java
import java.util.Scanner;

public class FibonacciSeries {

    // Method to generate and display the Fibonacci series
    public static void displayFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        // Initialize the first two numbers of the Fibonacci series
        int first = 0, second = 1;

        System.out.println("Fibonacci series of length " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second; // Calculate the next number in the series
            first = second; // Update the values
            second = next;
        }
        System.out.println(); // Move to the next line after printing the series
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the Fibonacci series (n): ");
        int n = scanner.nextInt(); // Read user input

        // Display the Fibonacci series
        displayFibonacciSeries(n);

        scanner.close(); // Close the Scanner object
    }
}
