public class Account {
    String customerName;
    String customerID;
    int balance = 0;
    int previousTransaction = 0;
    Account(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }
    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("Amount Deposited Successfully");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Please enter the amount greater than 0");
        }
    }
   void withdraw(int amount) {
        if (balance >= amount) {
            if (amount > 0) {
                balance = balance - amount;
                previousTransaction = -amount;
                System.out.println("Withdrawal Successful");
                System.out.println("New Balance: " + balance);
            } else {
                System.out.println("Please enter the amount greater than 0");
            }
        } else {
            System.out.println("Insufficient Funds, Cannot Withdraw");
        }
    }
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transactions occurred");
        }
    }
    void calculateInterest(int years) {
        double interestRate = 0.0185;
        double newBalance = (balance * interestRate * years) + balance;

        System.out.println("The Current Interest Rate is: " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years your balance will be: " + newBalance);
    }
}