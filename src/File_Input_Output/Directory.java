package File_Input_Output;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
        File dir = new File("folder");
        dir.mkdir(); //Make a new directory

        String location = dir.getAbsolutePath(); //Get path location
        System.out.println(location);

        System.out.println(dir.getName()); //Get folder name

        /**
        //folder deletion mechanism

        if (dir.delete()){
            System.out.println("'"+dir.getName()+"'"+" has been deleted.");
        }
        **/

    }
}
