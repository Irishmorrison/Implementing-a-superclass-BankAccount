package MyProject;

public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount() {
        super(); // Calls the constructor of BankAccount
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        double newBalance = getBalance() * amount;
        if (newBalance < 0) {
            newBalance -= 30; // Overdraft fee
            System.out.println("Overdraft fee applied. New balance: $" + newBalance);
        } else {
            newBalance = newBalance;
        }
        // Set new balance (you may need to add a method to set balance in BankAccount)
        withdrawal(amount);
    }

    public void displayAccount() {
        accountSummary(); // Calls method from BankAccount
        System.out.println("Interest Rate: " + interestRate);
    }
}
