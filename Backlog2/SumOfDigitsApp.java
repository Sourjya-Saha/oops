import java.util.Scanner;

class SumOfDigits {
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

public class SumOfDigitsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumOfDigits obj = new SumOfDigits();

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        int result = obj.sumOfDigits(number);
        System.out.println("Sum of digits: " + result);

        scanner.close();
    }
}
