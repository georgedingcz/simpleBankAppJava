import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("1. Create acount");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter account number:");
                int accountNumber = scanner.nextInt();
                System.out.println("Enter initial deposit:");
                double deposit = scanner.nextDouble();
                account = new BankAccount (accountNumber, deposit);
                System.out.println("Account created");
            }
            else if (choice == 2) {
                System.out.println("Enter deposit amount");
                double amount = scanner.nextDouble();
                account.deposit(amount);
                System.out.println("Deposited " + amount);
            }
            else if (choice == 3) {
                System.out.println("Enter withdrawal amount:");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                System.out.println("Withdrew " + withdrawAmount);
            }
            else if (choice == 4) {
                System.out.println("Your balance: " + account.getBalance());
            }
            else if (choice == 5) {
                System.out.println("Goodbye");
                scanner.close();
                return;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
    }
    //current issues--i cannot do deposit etc. but the account numbers are never stored
}
