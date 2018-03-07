package basic;

import java.util.Scanner;

public class HelloWorldInput {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Your Name:");

        String name = sc.nextLine();
        System.out.println("Hello! " + name +"?");


    }
}
