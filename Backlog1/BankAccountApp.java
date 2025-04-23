import java.util.Scanner;

class BankAccount {
    private String name;
    private int accountNo;
    private String accountType;
    private double balance;

    // Constructor to assign initial values
    public BankAccount(String name, int accountNo, String accountType, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input account details
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter account number: ");
        int accountNo = scanner.nextInt();
        
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();
        
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        
        // Create BankAccount object
        BankAccount account = new BankAccount(name, accountNo, accountType, balance);

        // Display account details
        account.displayAccount();
        
        // Deposit and withdraw operations
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        
        // Display updated account details
        account.displayAccount();
        
        scanner.close();
    }
}
