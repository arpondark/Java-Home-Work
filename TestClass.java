import java.util.ArrayList;
import java.util.Scanner;


class Account {
    private int accountNumber;
    private String accountHolderName;
    private String branchName;
    private double balance;
    private float interestRate;

    public Account(int accountNumber, String accountHolderName, String branchName, double balance, float interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.branchName = branchName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}


public class TestClass {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(101, "Alice", "Main Branch", 5000.0, 3.5f));
        accounts.add(new Account(102, "Bob", "North Branch", 3000.0, 4.0f));
        accounts.add(new Account(103, "Charlie", "East Branch", 7000.0, 2.8f));
        accounts.add(new Account(104, "Diana", "West Branch", 10000.0, 5.0f));
        accounts.add(new Account(105, "Eve", "South Branch", 2500.0, 3.2f));

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an account number to search: ");
        int searchAccountNumber = scanner.nextInt();

        boolean accountFound = false;
        for (Account account : accounts) {
            if (account.getAccountNumber() == searchAccountNumber) {
                System.out.println("Account Found:");
                account.displayAccount();
                accountFound = true;
                break;
            }
        }

        if (!accountFound) {
            System.out.println("Account not found.");
        }

        scanner.close();
    }
}
