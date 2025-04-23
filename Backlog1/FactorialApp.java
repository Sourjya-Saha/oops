
import java.util.Scanner;

class Factorial {
    // Method to calculate factorial using recursion
    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to calculate factorial: ");
        int num = scanner.nextInt();
        
        Factorial fact = new Factorial();
        System.out.println("Factorial of " + num + " is: " + fact.calculateFactorial(num));
        
        scanner.close();
    }
}
