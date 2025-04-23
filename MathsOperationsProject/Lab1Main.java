import mathops.*;
import java.util.*;

public class Lab1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            Add add = new Add();
            Subtract sub = new Subtract();
            Multiply mul = new Multiply();
            Divide div = new Divide();

            System.out.println("Addition: " + add.add(a, b));
            System.out.println("Subtraction: " + sub.subtract(a, b));
            System.out.println("Multiplication: " + mul.multiply(a, b));
            System.out.println("Division: " + div.divide(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
