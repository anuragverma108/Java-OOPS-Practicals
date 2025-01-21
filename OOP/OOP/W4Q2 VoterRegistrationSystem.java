import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a Person
class Person {
    int id;
    String name;
    String gender;
    String dateOfBirth; // Format: YYYY-MM-DD

    // Constructor for Person
    public Person(int id, String name, String gender, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    // Method to calculate age based on date of birth
    public int getAge() {
        String[] dobParts = dateOfBirth.split("-");
        int birthYear = Integer.parseInt(dobParts[0]);
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gender: " + gender + ", DOB: " + dateOfBirth + ", Age: " + getAge();
    }
}

// Custom Exception for invalid voters
class InvalidVoterException extends Exception {
    public InvalidVoterException(String message) {
        super(message);
    }
}

// Class to represent a valid Voter
class Voter {
    int voterId;
    Person person;

    // Constructor for Voter
    public Voter(int voterId, Person person) {
        this.voterId = voterId;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Voter ID: " + voterId + ", " + person;
    }
}

// Main class to handle Voter Registration
public class VoterRegistrationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create an array of n Person objects
        System.out.print("Enter the number of persons to create: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1) + " (ID, Name, Gender, DOB [YYYY-MM-DD]):");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String name = scanner.nextLine();
            String gender = scanner.nextLine();
            String dob = scanner.nextLine();
            persons.add(new Person(id, name, gender, dob));
        }

        // Step 2: Create an array of m valid voters
        ArrayList<Voter> validVoters = new ArrayList<>();
        ArrayList<Person> invalidVoters = new ArrayList<>();

        // Step 3: Implement voter registration
        System.out.println("\nRegistering voters...");
        int voterIdCounter = 1;
        for (Person person : persons) {
            try {
                // Register the person as a voter
                if (person.getAge() < 18) {
                    throw new InvalidVoterException("Person with ID " + person.id + " is below 18 years old.");
                }
                validVoters.add(new Voter(voterIdCounter++, person));
            } catch (InvalidVoterException e) {
                System.out.println(e.getMessage());
                invalidVoters.add(person);
            }
        }

        // Step 4: List all registered voters
        System.out.println("\nList of Registered Voters:");
        for (Voter voter : validVoters) {
            System.out.println(voter);
        }

        // Step 5: List all invalid voters
        System.out.println("\nList of Invalid Voters:");
        for (Person invalidPerson : invalidVoters) {
            System.out.println(invalidPerson);
        }

        scanner.close();
    }
}
