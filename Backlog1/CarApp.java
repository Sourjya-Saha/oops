import java.util.Scanner;

class Car {
    private int speed;

    // Constructor to initialize speed to 0 initially
    public Car() {
        speed = 0;
    }

    // Method to start the car with speed 30
    public void carStart() {
        speed = 30;
        printSpeed();
    }

    // Method to slow down the car to speed 20
    public void carSlow() {
        speed = 20;
        printSpeed();
    }

    // Method to speed up the car to speed 30
    public void carFast() {
        speed = 30;
        printSpeed();
    }

    // Method to print the current speed of the car
    public void printSpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }
}

public class CarApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Car object
        Car car = new Car();
        
        // Display the available options
        System.out.println("Choose an option to control the car:");
        System.out.println("1. Start car (speed 30)");
        System.out.println("2. Slow down car (speed 20)");
        System.out.println("3. Speed up car (speed 30)");

        // Accept input to control the car
        int choice;
        do {
            System.out.print("Enter your choice (1/2/3) or 0 to exit: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    car.carStart(); // Start the car
                    break;
                case 2:
                    car.carSlow(); // Slow the car
                    break;
                case 3:
                    car.carFast(); // Speed up the car
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 0 to exit.");
            }
        } while (choice != 0); // Keep running until the user chooses to exit

        scanner.close();
    }
}
