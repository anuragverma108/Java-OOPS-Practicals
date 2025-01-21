// File Name: PersonEmployeeDemo.java

// Base class: Person
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details of the person
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Employee
class Employee extends Person {
    int employeeId;
    double salary;

    // Constructor for Employee, using super to call the superclass constructor
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age); // Call the constructor of the Person class
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display details of the employee
    public void displayEmployeeDetails() {
        // Display person details using the method from the superclass
        displayPersonDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

// Main class to demonstrate the functionality
public class PersonEmployeeDemo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Alice", 30, 101, 50000.0);

        // Display details of the employee
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
    }
}
