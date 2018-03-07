package basic;

public class LecFourMIsc {
    public static void main(String[] args) {

        int a = 10;
        int b = 40;
        PrLn(compare(a, b));
        PrLn(a<b? a:b);
        PrLn(a<b? "A is less than B" : "b IS LESS THAN  a");

        int x = 2;
        int y = 3;

        y = (calNUmber(x, y));
        PrLn("y = "+y);
        PrLn("x + y = "+calNUmber(x, y));

        PrLn("a + b = "+calNUmber(a, b));

    }

    //Method
    static String compare(int num1, int num2){
        if(num1 < num2){
            return "A is less than B";
        }else {
            return "b IS LESS THAN  a";
        }
    }

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
