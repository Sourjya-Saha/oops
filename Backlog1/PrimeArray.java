import java.util.Scanner;

public class PrimeArray {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Check each element and print if it's prime or not
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is a Prime number.");
            } else {
                System.out.println(arr[i] + " is NOT a Prime number.");
            }
        }

        scanner.close();
    }
}
