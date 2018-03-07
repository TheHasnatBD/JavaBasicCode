package basic;

import java.util.Scanner;

public class Method {

    static Scanner myScn = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        boolean stmnt =  Result(num1, num2);
        System.out.println(stmnt);

        System.out.print("Enter any num to multiply by 10 : ");
        int num = myScn.nextInt();

        int rslt = Res(num);
        System.out.println(num + " of 10x is = "+rslt);
    }

    //Method
    static public boolean Result(int val1, int val2){
        boolean ans = val1 > val2;
        return ans;
    }

    static public int Res(int val1){
        val1 *= 10;
        return val1;
    }
}

