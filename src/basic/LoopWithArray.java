package basic;

import java.util.Scanner;

public class LoopWithArray {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] tDarray = new int[2][4];

        PrLn("Enter Input:");
        for (int row = 0; row < 2; row++){
            for (int clmn = 0; clmn < 4; clmn++){
                Pr("TwoArray["+row+"]["+clmn+"] = ");
                tDarray[row][clmn] = scanner.nextInt();
            }
        }

        for (int row = 0; row < 2; row++){
            for (int clmn = 0; clmn < 4; clmn++){
                Pr(tDarray[row][clmn]+"\t");
            }
            PrLn("");
        }



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
