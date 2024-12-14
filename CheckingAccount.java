java
public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        if (getBalance() < amount) {
            withdrawal(amount + 30); // Apply overdraft fee
            System.out.println("Overdraft! A fee of $30 has been applied.");
        } else {
            withdrawal(amount);
        }
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
