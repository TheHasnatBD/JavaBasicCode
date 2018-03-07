package ThreadTwo;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CustomRunableObject customRunableObject1 = new CustomRunableObject("One", 0);
        CustomRunableObject customRunableObject2 = new CustomRunableObject("Two", 200);
        CustomRunableObject customRunableObject3 = new CustomRunableObject("Three", 100000);
       // CustomRunableObject customRunableObject4 = new CustomRunableObject("Four", 5000);

        Thread thread1 = new Thread(customRunableObject1);
        Thread thread2 = new Thread(customRunableObject2);
        Thread thread3 = new Thread(customRunableObject3);
        Thread thread4 = new Thread(customRunableObject1);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        System.out.println("Enter a command line prompt this thread:");

        String command_string = scanner.nextLine();

        while (!command_string.toLowerCase().equals("exit")) {

            if (command_string.equals("1")) {
                System.out.println("Counter in thread 1: " + customRunableObject1.getCounter());

            } else if (command_string.equals("2")) {
                System.out.println("Counter in thread 2: " + customRunableObject2.getCounter());

            } else if (command_string.equals("3")) {
                System.out.println("Counter in thread 3: " + customRunableObject3.getCounter());

            } else if (command_string.equals("4")) {
                System.out.println("Counter in thread 4: " + customRunableObject1.getCounter());

            } else if (command_string.equals("1S")) {
                thread1.interrupt();
                System.out.println("Thread 1 Stopped");

            } else if (command_string.equals("2S")) {
                thread2.interrupt();
                System.out.println("Thread 2 Stopped");

            } else if (command_string.equals("3S")) {
                thread3.interrupt();
                System.out.println("Thread 3 Stopped");

            } else if (command_string.equals("4S")) {
                thread4.interrupt();
                System.out.println("Thread 4 Stopped");

            } else {
                System.out.println("Give a correct command");
            }

            System.out.println("Enter a command line prompt this thread:");
            command_string = scanner.nextLine();

        }
    }
}
