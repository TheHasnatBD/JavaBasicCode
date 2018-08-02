package inheritance;

public class Savings extends BankAccount {

    private double interestRate;


    public Savings(String accountName, String accountNo, double accountBalance, double interestRate) {
        super(accountName, accountNo, accountBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



    @Override
    public String withdraw(double amount) {
        if (getAccountBalance() - amount > 500) {
            setAccountBalance(getAccountBalance() - amount);
            return "Your amount has been debited with BDT " + amount + "/=\nCurrent balance = " + getAccountBalance() + "/=\n";

        } else {
            return "Oops, insufficient fund";
        }
    }



}
