package File_Input_Output;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class InputFile {

    public static void main(String[] args) {

        String name, mobile;

        try {
            Formatter formatter = new Formatter("/home/hasnat/IdeaProjects/Java Code/Java_Core/hasnatFolder/hasnat.txt");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your student number: ");
            int number = scanner.nextInt();

            for (int i = 1; i <= number; i++){
                System.out.println("Person name and mobile- ");
                name = scanner.next();
                mobile = scanner.next();

                formatter.format("%s\t%s\r\n", name, mobile);
            }
            formatter.close();
            System.out.println("File input successfully.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
