import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            Amount transaction = new Amount(amount, TransactionType.DEPOSIT);
            this.transactions.add(transaction);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            Amount transaction = new Amount(amount, TransactionType.WITHDRAWAL);
            this.transactions.add(transaction);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void printTransactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }
}
