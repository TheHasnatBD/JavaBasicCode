package inheritance;

public class Checking extends BankAccount{

    private double serviceCharge;

    public Checking(String accountName, String accountNo, double accountBalance, double serviceCharge) {
        super(accountName, accountNo, accountBalance);
        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }


}
