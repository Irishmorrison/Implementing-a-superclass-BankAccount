java
public class TestBankAccount {
    public static void main(String[] args) {
        // Create a Bank Account
        BankAccount account = new BankAccount();
        account.setFirstName("John");
        account.setLastName("Doe");
        account.setAccountID(123456);
        account.deposit(500);
        account.accountSummary();

        // Create a Checking Account
        CheckingAccount checkingAccount = new CheckingAccount(1.5);
        checkingAccount.setFirstName("Jane");
        checkingAccount.setLastName("Smith");
        checkingAccount.setAccountID(789012);
        checkingAccount.deposit(200);
        checkingAccount.processWithdrawal(250); // Should trigger overdraft
        checkingAccount.displayAccount();
    }
}
