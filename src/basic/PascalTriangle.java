package basic;

import java.util.Scanner;

public class PascalTriangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pr("to Exit type -1\n");
        PrLn("Give Pascale Triangle length: ");
        int user_input = scanner.nextInt();

        while (user_input != -1){
            if (user_input < -1 || user_input > 20){
                PrLn("Please Enter the number btn of -1 ~ 20");
                user_input = scanner.nextInt();
                continue;
            }

            printPascleTriangle(user_input);
            PrLn("\n");


            PrLn("Please Enter the number btn of -1 ~ 20");
            user_input = scanner.nextInt();

        }


    }

    ///Methods
    static void printPascleTriangle(int length){
            int[][] pascal = new int[length][length];

            for (int i = 0; i < length; i++){
                pascal[0][i] = 1;
                pascal[i][0] = 1;
            }

            for (int row = 1; row < length; row++){
                for (int column = 1; column < length-row; column++){
                    pascal[row][column] = pascal[row][column-1] + pascal[row-1][column];
                }
            }

        for (int row = 0; row < length; row++){
            for (int column = 0; column < length-row; column++){
                Pr(pascal[row][column]+"\t\t\t");
            }
            PrLn("\n");
        }

    }

    static void PrLn(Object anyObject){
        System.out.println(anyObject);
    }
    static void Pr(Object anyObject){
        System.out.print(anyObject);
    }
}
