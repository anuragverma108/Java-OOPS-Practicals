// File Name: Figure.java

package Shape;

public class Figure {

    // Method to calculate the volume of a Cube
    public double calculateVolume(double side) {
        return side * side * side; // Volume of Cube = side^3
    }

    // Method to calculate the volume of a Cylinder
    public double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height; // Volume of Cylinder = π * r^2 * h
    }

    // Method to calculate the volume of a Rectangular Box
    public double calculateVolume(double length, double width, double height) {
        return length * width * height; // Volume of Rectangular Box = l * w * h
    }
}
