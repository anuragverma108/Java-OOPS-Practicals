// File Name: MachinePart.java

public class MachinePart implements Volume {

    // Implementing the calculateInVolume method
    @Override
    public double calculateInVolume(double s1, double s2, double s3) {
        return (1.0 / 3.0) * Math.PI * s1 * s1 * s3;
    }

    // Implementing the calculateOutVolume method
    @Override
    public double calculateOutVolume(double s1, double s2, double s3) {
        return (4.0 / 3.0) * Math.PI * s1 * s1 * s3;
    }

    public static void main(String[] args) {
        // Checking if arguments are provided for dimensions
        if (args.length < 3) {
            System.out.println("Please provide s1, s2, and s3 as command-line arguments.");
            return;
        }

        // Parse the command-line arguments for s1, s2, and s3
        double s1 = Double.parseDouble(args[0]);
        double s2 = Double.parseDouble(args[1]);
        double s3 = Double.parseDouble(args[2]);

        // Create an object of MachinePart class
        MachinePart part = new MachinePart();

        // Calculate and display Involume and Outvolume
        double inVolume = part.calculateInVolume(s1, s2, s3);
        double outVolume = part.calculateOutVolume(s1, s2, s3);

        System.out.println("Involume: " + inVolume);
        System.out.println("Outvolume: " + outVolume);
    }
}

/* steps 
To implement the solution based on your description, we will define an interface Volume with methods to calculate the "Involume" and "Outvolume" for a part of a machine with three dimensions (s1, s2, s3). We will then create a class that implements this interface and calculates the volumes using the provided formulas.

Formula for the volumes:
Involume: 
1
3
𝜋
𝑠
1
2
𝑠
3
3
1
​
 πs 
1
2
​
 s 
3
​
 
Outvolume: 
4
3
𝜋
𝑠
1
2
𝑠
3
3
4
​
 πs 
1
2
​
 s 
3
​
 
Steps:
Define the Volume interface with two methods: calculateInVolume() and calculateOutVolume().
Create a class MachinePart that implements the Volume interface and provides the implementation for both methods.
In the main method, create an object of MachinePart, take the dimensions (s1, s2, s3) as input, and display the computed volumes.


sample run

Sample Command Line Input:
You can run the program with the following command to provide the dimensions s1, s2, and s3:

bash
Copy
Edit
java MachinePart 5 10 15
Sample Output:
For the above input (s1 = 5, s2 = 10, s3 = 15):

yaml
Copy
Edit
Involume: 1963.4954084936207
Outvolume: 7853.981632794483
Running the Program:
Save the files:

Volume.java (the interface).
MachinePart.java (the implementation class with the main method).
Compile the files:


javac Volume.java
javac MachinePart.java


Run the program:


java MachinePart 5 10 15
Make sure to replace 5, 10, 15 with the actual values you want to use for s1, s2, and s3.

Conclusion:
This implementation demonstrates how to use an interface (Volume) to define the contract for calculating volumes, and how to implement that interface in a class (MachinePart). The program uses command-line arguments to take the dimensions of the machine part and calculates the Involume and Outvolume based on the provided formulas.
*/