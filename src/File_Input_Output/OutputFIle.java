package File_Input_Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OutputFIle {
    public static void main(String[] args) {

        File file = new File("/home/hasnat/IdeaProjects/Java Code/Java_Core/hasnatFolder/hasnat.txt");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                String name = scanner.next();
                String mobile = scanner.next();

                System.out.println("Name: "+name+"\tMobile: "+mobile);
            }
            scanner.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
