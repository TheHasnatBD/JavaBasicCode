package basic;

public class DataType_Operator {
    public static void main(String[] args) {

        int[] cards = {1, 2, 3, 4, 8, 1, 9};
        char[] card = {'A', 'B', 'a', 'b', '5'};
        int[] card2 = new int[6];

        short shortNumber = 5;
        int intNUmber = 7;
        int secondIntNUmber = 7;
        float floatNUmber = 11;
        char myChar = 'A';
        boolean statement = true;
        boolean stmntTwo = (secondIntNUmber + intNUmber) == 9;

        int result = intNUmber/3;
        result--;

        //secondIntNUmber = secondIntNUmber + 2;
        secondIntNUmber += 2;
        secondIntNUmber /= 2;
        secondIntNUmber -= 2;

        System.out.println("Data Type + Array \n");
        System.out.println("Short NUm : "+shortNumber);
        System.out.println("Int Num : "+intNUmber);
        System.out.println("FLOAT nUM : "+floatNUmber);
        System.out.println("Result : "+result);
        System.out.println("Char : "+myChar);
        System.out.println("Stmnt : "+statement);
        System.out.println("Stmnt2 : "+stmntTwo);
        System.out.println("2nd Int num : "+secondIntNUmber);
        System.out.println("Array : "+cards[3]);
        System.out.println("Char Array : "+card[3]);
    }
}
