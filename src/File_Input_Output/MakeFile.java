package File_Input_Output;

import java.io.File;
import java.io.IOException;

public class MakeFile {
    public static void main(String[] args) {

        File dir = new File("hasnatFolder");
        dir.mkdir(); //Make a new directory

        String path_location = dir.getAbsolutePath(); //get folder location

        //create file in that folder
        File file1 = new File(path_location+"/hasnat.txt");
        File file2 = new File(path_location+"/infobox.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();

            System.out.println("Files have been created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        /**
        //file delete and checking existence

        file1.delete(); // file delete
        // existence
        if (file1.exists()){
            System.out.println("This File has been exists.");
        }else {
            System.out.println("This File hasn't been exists.");
        }

         **/


    }
}
