import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of vehicle: ");
        System.out.println("1. Bus");
        System.out.println("2. Car");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt(); sc.nextLine();  // Consume the newline character

        if (choice == 1) {
            Bus bus = new Bus();
            bus.showData();
        } else if (choice == 2) {
            Car car = new Car();
            car.showData();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
