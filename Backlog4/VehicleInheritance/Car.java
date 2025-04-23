import java.util.Scanner;  // Add this import statement

public class Car extends Vehicle {
    private String manufacturerName;

    public Car() {
        super();  // Call the constructor of the Vehicle class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Manufacturer Name for the Car: ");
        manufacturerName = sc.nextLine();
    }

    @Override
    public void showData() {
        super.showData();  // Call the showData method of Vehicle class
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}
