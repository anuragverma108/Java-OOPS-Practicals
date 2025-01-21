// File Name: TestVolume.java

import Shape.Figure; // Importing the Figure class from the Shape package

public class TestVolume {
    public static void main(String[] args) {
        // Create an object of the Figure class
        Figure figure = new Figure();

        // Calculate and display the volume of a Cube
        double cubeVolume = figure.calculateVolume(5); // Side of cube = 5
        System.out.println("Volume of the Cube: " + cubeVolume);

        // Calculate and display the volume of a Cylinder
        double cylinderVolume = figure.calculateVolume(3, 7); // Radius = 3, Height = 7
        System.out.println("Volume of the Cylinder: " + cylinderVolume);

        // Calculate and display the volume of a Rectangular Box
        double boxVolume = figure.calculateVolume(4, 5, 6); // Length = 4, Width = 5, Height = 6
        System.out.println("Volume of the Rectangular Box: " + boxVolume);
    }
}

/*Running the Program:
Create the "Shape" package:

Create a folder named Shape and place the Figure.java file inside it.
Compile the files:

Open the command line and navigate to the directory containing the Shape folder and TestVolume.java file.
First, compile the Figure.java file

javac Shape/Figure.java
javac TestVolume.java


java TestVolume


sample op 
Volume of the Cube: 125.0
Volume of the Cylinder: 197.92033717615698
Volume of the Rectangular Box: 120.0

file structure
<project_root>
    ├── Shape
    │   └── Figure.java
    └── TestVolume.java
*/