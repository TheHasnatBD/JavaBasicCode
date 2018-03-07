package FileIO;

import java.io.*;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        File in_file = new File("/home/hasnat/IdeaProjects/Java Code/Java_Core/src/FileIO/input.inp");
        File out_file = new File("/home/hasnat/IdeaProjects/Java Code/Java_Core/src/FileIO/output.txt");

        try {
            //Scanner scanner = new Scanner(in_file);

            FileReader fileReader = new FileReader(in_file);

            try {
                FileWriter fileWriter = new FileWriter(out_file);
                //Scanner scanner = new Scanner(fileReader);
                Scanner scanner = new Scanner(System.in);

                while (scanner.hasNext()){
                    String temp_str = scanner.nextLine();
                    //System.out.println(temp_str+"");

                    fileWriter.write(temp_str+"\n");
                }
                fileReader.close();
                //fileWriter.close();
                fileWriter.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not Found.");
            e.printStackTrace();
        }
    }

}
