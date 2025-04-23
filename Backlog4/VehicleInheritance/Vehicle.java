import java.util.Scanner;

public class Vehicle {
    // Protected instance variables
    protected String licenseNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    // Constructor
    public Vehicle() {
        // Use Scanner to take manual input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter License Number: ");
        licenseNumber = sc.nextLine();

        System.out.print("Enter Speed: ");
        speed = sc.nextInt(); sc.nextLine();  // Consume the newline character

        System.out.print("Enter Color: ");
        color = sc.nextLine();

        System.out.print("Enter Owner Name: ");
        ownerName = sc.nextLine();
    }

    // Method to show vehicle data
    public void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}
