import java.util.Scanner;

public class Factorial {
    static long[] cache = new long[21]; 


    public static long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("value of x must be positive");
        }
        if (x >= cache.length) {
            throw new IllegalArgumentException("result will overflow.");
        }

        if (cache[x] != 0) {
            return cache[x]; 
        }

        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }

        cache[x] = result;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x to compute x!: ");

        try {
            int x = sc.nextInt();
            long fact = factorial(x);
            System.out.println("Factorial of " + x + " is: " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: Please enter an integer.");
        }
    }
}
