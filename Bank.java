import java.util.*;
public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account name:");
        String custName = sc.nextLine();

        System.out.println("Enter Customer ID:");
        String custID = sc.nextLine();

        Account a = new Account(custName, custID);

        System.out.println("----------------------------------");
        System.out.println("Welcome, " + a.customerName + "!");
        System.out.println("Your ID is: " + a.customerID);
        System.out.println("----------------------------------");

        char option;
        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect Any Option To Proceed:");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Interest");
            System.out.println("F. Exit");

            System.out.print("Enter your choice: ");
            option = sc.next().charAt(0);

            switch (option) {
                case 'A':
                    System.out.println("Account Balance = " + a.balance);
                    break;

                case 'B':
                    System.out.println("Enter amount to deposit:");
                    int depositAmount = sc.nextInt();
                    a.deposit(depositAmount);
                    break;

                case 'C':
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    a.withdraw(withdrawAmount);
                    break;

                case 'D':
                    a.getPreviousTransaction();
                    break;

                case 'E':
                    System.out.println("Enter years:");
                    int years = sc.nextInt();
                    a.calculateInterest(years);
                    break;

                case 'F':
                    System.out.println("Thank you for banking with us!");
                    sc.close();
                    flag = false;
                    break;

                default:
                    System.out.println("Error: Invalid option. Please enter A, B, C, D, E or F.");
            }
        }
    }
}