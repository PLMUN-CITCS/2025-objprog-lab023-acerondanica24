
class BankAccount {
    // Attributes with different access modifiers
    public String accountHolder;   
    private double balance;        
    protected String accountType; 


    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Getter method to access private balance
    public double getBalance() {
        return balance;
    }
}

// Main class to execute the program
public class BankAccountDemo {
    public static void main(String[] args) {
        // Creating a BankAccount object with initial details
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Performing transactions
        myAccount.deposit(250.0);  // Depositing $250
        myAccount.withdraw(100.0); // Withdrawing $100

        // Displaying account details
        System.out.println("Account Holde
