package basic;

public class Loop {
    public static void main(String[] args) {

        int[] numArray = new int[100];
        int i = 100;

        while (i > 0){
            numArray[i - 1] = i - 1;
            //numArray[i - 1] = (i - 1) * 2;
            i--;
        }
        while (i < 100){
            PrLn("numArray["+i+"] = "+numArray[i]);
            i++;
        }
        PrLn("\nSingle Array View\nnumArray["+50+"] = "+numArray[50]);

        //Do While
        int j = 2;
        do {
            PrLn("Do While");
            PrLn(j);
            j--;
        }while (j < 2 && j > 0);

        //While
        j = 2;
        while (j < 2 && j > 0){
            PrLn("While "+j);
            j--;
        }

        PrLn("\nFor Loop:");
        //For Loop
        for (int k = 2; k < 100; k *= 2){
            PrLn(k);
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
