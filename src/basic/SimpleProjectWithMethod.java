package basic;

import java.util.Scanner;

public class SimpleProjectWithMethod {

    static Scanner mySc = new Scanner(System.in);

    static String[] softW = {"Tricks", "Calculator", "Quiz"};
    static final double forStudentDisC = .10;
    static final double forFarmerDiscC = .08;
    static final double forTeacherDisC = .07;

    public static void main(String[] args) {
        PrLn("## Welcome to our software ##\nSoftware Name: Tricks, Calculator, Quiz");
        Pr("What you need?\nType: ");
        String inputAns = mySc.nextLine();

        if(softW[0].toLowerCase().equals(inputAns.toLowerCase())){
            PrLn("You opted for "+softW[0]+" Software.");
            CalculatePrice(softW[0]);

        }else if(softW[1].toLowerCase().equals(inputAns.toLowerCase())){
            PrLn("You opted for "+softW[1]+" Software.");
            CalculatePrice(softW[1]);

        }else if(softW[2].toLowerCase().equals(inputAns.toLowerCase())){
            PrLn("You opted for "+softW[2]+" Software.");
            CalculatePrice(softW[2]);

        }else{
            PrLn("This Software unavailable.");
        }
    }

    //Custom Methods

    static void CalculatePrice(String softName){

        double price = 20000;
        PrLn("Are you Student, Farmer, Teacher?\nAns- ");
        String ans = mySc.nextLine();

        if(ans.toLowerCase().equals("student")){
            price = price - (price * forStudentDisC);
            ShowPrice(price);

        }else if(ans.toLowerCase().equals("farmer")){
            price = price - (price * forFarmerDiscC);
            ShowPrice(price);

        }else if(ans.toLowerCase().equals("teacher")){
            price = price - (price * forTeacherDisC);
            ShowPrice(price);

        }else{
            PrLn("Invalid Software Offer. You have to pay for 20,000 /=");
        }
    }

    static void ShowPrice(double price){
        PrLn("Your Discount Price = "+price+" Taka");
        PrLn("Thank you for paying.");
    }


    static void PrLn(Object anyObject){
        System.out.println(anyObject);
    }
    static void Pr(Object anyObject){
        System.out.print(anyObject);
    }
}
