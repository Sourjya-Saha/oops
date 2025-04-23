import java.util.Scanner;

// Class with static variable and static methods
class MathOperation {
    // Static variable PI
    static double PI = 3.14159;

    // Static method for multiplication
    public static double mul(double a, double b) {
        return a * b;
    }

    // Static method for division
    public static double div(double a, double b) {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a Number
        }
    }
}

// Main class to interact with user
public class StaticExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MATH OPERATION PROGRAM");
        System.out.println("Static Variable PI: " + MathOperation.PI);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double product = MathOperation.mul(num1, num2);
        double quotient = MathOperation.div(num1, num2);

        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("Division of " + num1 + " by " + num2 + " is: " + quotient);

        scanner.close();
    }
}
