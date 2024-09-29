public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "John Doe");

        // Deposit money
        account.deposit(500.0);
        account.deposit(200.0);

        // Withdraw money
        account.withdraw(100.0);

        // Print transaction history
        account.printTransactionHistory();

        // Check balance
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
