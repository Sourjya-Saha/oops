import java.util.Scanner;  // Add this import statement

public class Bus extends Vehicle {
    private int routeNo;

    public Bus() {
        super();  // Call the constructor of the Vehicle class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Route Number for the Bus: ");
        routeNo = sc.nextInt();
    }

    @Override
    public void showData() {
        super.showData();  // Call the showData method of Vehicle class
        System.out.println("Route Number: " + routeNo);
    }
}
