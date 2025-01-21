// File Name: PrimeNumberUtils.java

public class PrimeNumberUtils {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print all prime numbers in a given range
    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers in range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            // Part (a): Check if a single number is prime
            int number = Integer.parseInt(args[0]);
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } else if (args.length == 2) {
            // Part (b): Print all prime numbers in a range
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);
            printPrimesInRange(start, end);
        } else {
            System.out.println("Invalid arguments. Usage:");
            System.out.println("1. For prime check: java PrimeNumberUtils <number>");
            System.out.println("2. For prime range: java PrimeNumberUtils <start> <end>");
        }
    }
}


/*javac PrimeNumberUtils.java
java PrimeNumberUtils 29
java PrimeNumberUtils 10 50
*/