import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Baby {
    private String name;
    private LocalDate dateOfBirth;
    private LocalDate polioDropsDate;

    // Constructor to initialize Baby's details and calculate polio drops date
    public Baby(String name, String dateOfBirth) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
        this.polioDropsDate = this.dateOfBirth.plusDays(45); // Polio drops 45 days after birth
    }

    // Method to display Baby details
    public void displayDetails() {
        System.out.println("Baby Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Polio Drops Date (45 days from birth): " + polioDropsDate);
    }
}

public class BabyApp {
    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);

        // Taking baby's name and date of birth as input
        System.out.print("Enter baby's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter baby's date of birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        // Creating Baby object using the constructor
        Baby baby = new Baby(name, dob);

        // Displaying baby details
        baby.displayDetails();

        // Closing scanner
        scanner.close();
    }
}
