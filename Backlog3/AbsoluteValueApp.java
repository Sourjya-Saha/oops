import java.util.Scanner;

class MyClass {
    // Method to find absolute value of an int
    public int abs(int x) {
        return (x < 0) ? -x : x;
    }

    // Method to find absolute value of a float
    public float abs(float x) {
        return (x < 0) ? -x : x;
    }

    // Method to find absolute value of a double
    public double abs(double x) {
        return (x < 0) ? -x : x;
    }
}

public class AbsoluteValueApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyClass obj = new MyClass();

        int choice;
        do {
            System.out.println("\nABSOLUTE VALUE CALCULATOR");
            System.out.println("1. Integer");
            System.out.println("2. Float");
            System.out.println("3. Double");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int iVal = scanner.nextInt();
                    System.out.println("Absolute value: " + obj.abs(iVal));
                    break;
                case 2:
                    System.out.print("Enter a float: ");
                    float fVal = scanner.nextFloat();
                    System.out.println("Absolute value: " + obj.abs(fVal));
                    break;
                case 3:
                    System.out.print("Enter a double: ");
                    double dVal = scanner.nextDouble();
                    System.out.println("Absolute value: " + obj.abs(dVal));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
