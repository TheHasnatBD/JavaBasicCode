package basic;

public class ConditionSwitch {

    public static void main(String[] args) {

        String myName = new String("Abdullah Al-Hasnat");
        PrLn(myName);

        if(myName.length() > 3) {
            PrLn("Length of this string : " + myName.length() + "\nPerfect");
        }else if(myName.length() < 3){
            PrLn("Length of this string : " + myName.length() +"\nSo Short");
        }else {
            PrLn("Length of this string : " + myName.length() + "\nNOt valid");
        }

    }

    static void PrLn(Object anyObject){
        System.out.println(anyObject);
    }
    static void Pr(Object anyObject){
        System.out.print(anyObject);
    }
}
