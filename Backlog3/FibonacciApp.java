import java.util.Scanner;

// Encapsulated class for Fibonacci logic
class FibonacciCalculator {

    // Recursive method to calculate nth Fibonacci number
    public int findFibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}

public class FibonacciApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciCalculator fib = new FibonacciCalculator();

        System.out.print("Enter the position (n) to find Fibonacci number: ");
        int n = scanner.nextInt();

        int result = fib.findFibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);

        scanner.close();
    }
}
