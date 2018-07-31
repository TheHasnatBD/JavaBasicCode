package inheritance;

public class BankAccount {

    private String accountName;
    private String accountNo;
    private double accountBalance;

    public BankAccount(String accountName, String accountNo, double accountBalance) {
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }





    public String deposit(double amount) {
        accountBalance += amount;
        return "Your amount has been credited with BDT " + amount + " /=\nYour current balance is " + accountBalance + " /=\n";
    }

    public String withdraw(double amount) {
            accountBalance -= amount;
            return "Your amount has been debited with BDT " + amount + "/=\nCurrent balance = " + accountBalance + "/=\n";
    }


}
