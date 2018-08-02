package inheritance;

public class BankMainClass {
    public static void main(String[] args) {

        Savings s_ac_1 = new Savings("name-a", "001", 5000, 10);
        Checking c_ac_1 = new Checking("name-b", "002", 20000, 5000);

        System.out.println("------Main Balance-------");
        System.out.println(s_ac_1.getAccountBalance());
        System.out.println(c_ac_1.getAccountBalance());

        System.out.println("------After deposit-------");
        System.out.println(s_ac_1.deposit(500));
        System.out.println(c_ac_1.deposit(1000));

        System.out.println("------After withdraw-------");
        //System.out.println(s_ac_1.withdraw(4000));
        //System.out.println(c_ac_1.withdraw(30000));


        /**
         * ------ withdraw using polymorphism -------
         */
        System.out.println("--withdraw using polymorphism--\n");
        BankAccount[] account = new BankAccount[2];
        account[0] = s_ac_1;
        account[1] = c_ac_1;

        for (BankAccount bankAccount : account){

            double withdrawAmount = 0.0;
            if (bankAccount instanceof Savings){
                withdrawAmount = 4000;
            } else if (bankAccount instanceof Checking){
                withdrawAmount = 30000;
            }
            System.out.println(bankAccount.withdraw(withdrawAmount));
        }



    }
}
