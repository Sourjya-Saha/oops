import java.util.Scanner;

public class ManualExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
            System.out.println("You are eligible.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You must be 18 or older.");
        }
    }
}
