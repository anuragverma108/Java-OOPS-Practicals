// File Name: PalindromeChecker.java

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Two-pointer approach to check for palindrome
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }

        // Take the first command line argument as the input string
        String input = args[0];

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

/*

javac PalindromeChecker.java
java PalindromeChecker <your_string>
*/