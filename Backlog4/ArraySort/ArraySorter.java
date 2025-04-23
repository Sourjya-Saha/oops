import java.util.Scanner;

public class ArraySorter {

    // Attribute to store the array
    private int[] arr;

    // Constructor to initialize the array
    public ArraySorter(int size) {
        arr = new int[size];
    }

    // Method to input values into the array
    public void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to sort the array in ascending order using Bubble Sort
    public void sortArray() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to display the sorted array
    public void displayArray() {
        System.out.println("Sorted Array (Ascending Order):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
