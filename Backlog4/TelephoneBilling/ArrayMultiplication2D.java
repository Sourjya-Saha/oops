import java.util.Scanner;

public class ArrayMultiplication2D {
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;

    // Constructor to initialize matrices
    public ArrayMultiplication2D(int rows, int cols) {
        matrix1 = new int[rows][cols];
        matrix2 = new int[rows][cols];
        result = new int[rows][cols];
    }

    // Method to take input for matrices
    public void inputMatrices() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("Matrix1[" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print("Matrix2[" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }
    }

    // Method to multiply matrices
    public void multiplyMatrices() {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        ArrayMultiplication2D obj = new ArrayMultiplication2D(rows, cols);
        obj.inputMatrices();
        obj.multiplyMatrices();
        obj.displayResult();
    }
}
