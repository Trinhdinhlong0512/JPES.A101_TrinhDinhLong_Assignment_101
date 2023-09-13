package fa.training.entities;

public class SavingsAccount {
    private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
        annualInterestRate = 0;
        savingsBalance = 0;
    }

    public SavingsAccount(double inRate, double savBal) {
        annualInterestRate = inRate;
        savingsBalance = savBal;
    }

    public double GetAnnualInterestRate() {
        return annualInterestRate;
    }

    public void SetAnnualInterestRate(double intRate) {
        annualInterestRate = intRate;
    }

    public double GetsavingsBalance() {
        return savingsBalance;
    }

    public void SetsavingsBalance(double savBal) {
        this.savingsBalance = savBal;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }
}
