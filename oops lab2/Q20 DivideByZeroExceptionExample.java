// File Name: DivideByZeroExceptionExample.java

public class DivideByZeroExceptionExample {

    public static void main(String[] args) {
        int dividend = 10;   // Example dividend
        int divisor = 0;     // Example divisor (set to 0 to cause divide by zero)
        int quotient = -1;   // Initialize quotient with -1 as the default value
        
        try {
            quotient = dividend / divisor; // Attempt to divide
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage()); // Catch divide by zero exception
        } finally {
            // In finally block, check if quotient is -1, meaning exception occurred
            if (quotient == -1) {
                System.out.println("Exception occurred");
            } else {
                System.out.println("Quotient is: " + quotient);
            }
        }
    }
}

/*
Steps to run the file:

1. Save the file as "DivideByZeroExceptionExample.java".
2. Open a terminal or command prompt.
3. Navigate to the directory where the file is saved.
4. Compile the Java file:
   javac DivideByZeroExceptionExample.java
5. Run the compiled program:
   java DivideByZeroExceptionExample

Sample Output (when divisor is 0):

Exception: / by zero
Exception occurred

Sample Output (when divisor is 2):

Quotient is: 5
*/
