package MyProject;

public class BankAccountTest {


    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setFirstName("John");
        account.setLastName("Doe");
        account.setAccountId(12345);
        account.deposit(1000);
        account.accountSummary();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Jane");
        checkingAccount.setLastName("Doe");
        checkingAccount.setAccountId(54321);
        checkingAccount.setInterestRate(0.05);
        checkingAccount.deposit(500);
        checkingAccount.processWithdrawal(600); // Overdraft
        checkingAccount.displayAccount();
    }
}
