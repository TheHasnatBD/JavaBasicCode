package basic;

import java.lang.reflect.Array;

public class StringArray {

    public static void main(String[] args) {

        String myName = new String("Abdullah Al-Hasnat");
        PrLn(myName);
        PrLn("Length of this string : "+myName.length());

        int [][] twoDArray = new int[2][3];
        twoDArray[0][0] = 11;
        twoDArray[0][1] = 2;
        twoDArray[0][2] = 3;
        twoDArray[1][0] = 7;
        twoDArray[1][1] = 8;
        twoDArray[1][2] = 5;
        // 1 2 3
        // 3 4 4

        twoDArray[0][0] += (twoDArray[0][1] + twoDArray[1][2]);
        PrLn("twoDArray[0][0] = " + twoDArray[0][0]);
    }

    static void PrLn(Object anyObject){
        System.out.println(anyObject);
    }
    static void Pr(Object anyObject){
        System.out.print(anyObject);
    }
}
