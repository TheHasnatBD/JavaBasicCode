package basic;

import java.util.Scanner;

public class TryCatch {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try {

            PrLn("Enter a number: ");
            int num = scanner.nextInt();

            while (num != 200){

                PrLn(100/num);

                PrLn("Enter other number: ");
                num = scanner.nextInt();


            }

        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            Pr("THanks");
        }

        PrLn("End Program");

    }

    //Method
    static int calNUmber(int num1, int num2){
        //int sum = num1 + num2;
        num1 += num2;
        return num1;
    }

    static void PrLn(Object anyObject){
        System.out.println(anyObject);
    }
    static void Pr(Object anyObject){
        System.out.print(anyObject);
    }
}
