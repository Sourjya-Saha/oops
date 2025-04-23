import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an object of ArraySorter with the specified size
        ArraySorter sorter = new ArraySorter(size);

        // Input the array elements from the user
        sorter.inputArray();

        // Sort the array in ascending order
        sorter.sortArray();

        // Display the sorted array
        sorter.displayArray();
    }
}
