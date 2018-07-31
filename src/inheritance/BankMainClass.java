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
        System.out.println(s_ac_1.withdraw(4000));
        System.out.println(c_ac_1.withdraw(30000));


    }
}
