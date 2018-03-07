package Thread;

import java.util.Scanner;

public class ThreadMain {

    static Scanner scanner = new Scanner(System.in);

    private static Thread thread1 = new Thread("Child1", 0, 1, 500, true);
    private static Thread thread2 = new Thread("Child2", 100, 10, 1000, true);
    private static Thread thread3 = new Thread("Child3", 1000, 100, 2000, true);

    public static void main(String[] args) {

        thread1.start(); thread2.start(); thread3.start();
        System.out.println("Enter a command line prompt this thread:");

        String command_string = scanner.nextLine();

        while (!command_string.toLowerCase().equals("exit")){

            if (command_string.equals("1")){
                System.out.println("Counter in thread 1: "+thread1.getCounter());
                threadStatus();

            }else if (command_string.equals("2")){
                System.out.println("Counter in thread 2: "+thread2.getCounter());
                threadStatus();

            }else if (command_string.equals("3")){
                System.out.println("Counter in thread 3: "+thread3.getCounter());
                threadStatus();

            }else if (command_string.equals("1S")){
                thread1.stopThread();
                System.out.println("Thread 1 Stopped");
                threadStatus();

            }else if (command_string.equals("2S")){
                thread2.stopThread();
                System.out.println("Thread 2 Stopped");
                threadStatus();

            }else if (command_string.equals("3S")){
                thread3.stopThread();
                System.out.println("Thread 3 Stopped");
                threadStatus();

            }else {
                System.out.println("Give a correct command");
            }


            command_string = scanner.nextLine();
        }

    }

    private static void threadStatus(){
        System.out.println("THread 1 is " + thread1.isThread_alive_flag());
        System.out.println("THread 2 is " + thread2.isThread_alive_flag());
        System.out.println("THread 3 is " + thread3.isThread_alive_flag());

    }

}
