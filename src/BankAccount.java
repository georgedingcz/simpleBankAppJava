//for creating and calculating
public class BankAccount {
    private int accountNumber;
    private double balance;

    //constructor for bank accounts
    public BankAccount(int accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    //method for depositing money
    public void deposit(double amount) {
        balance += amount;
    }

    //method for withdrawing money
    public void withdraw(double amount) {
        //there's enough money
        if(amount <= balance) {
            balance -= amount;
        }
        //there's not enough money to withdraw
        else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }


}
