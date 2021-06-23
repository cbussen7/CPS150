/*
Christopher Bussen
CPS 150 02
Lab 13
CopyFileToNewFile: no inputs ; string

program specifies a file name and path and then copies that file's
contents to a new file

ex1: program will print File was successfully copied if the path/name are correct and the file is successfully copied
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileToNewFile {
    public static void main(String [] args){
        //create an array for contents to be copied in
        byte [] array = new byte[50];

        try {
            //specify the file name of the file you want to be copied and the name of the file you want contents to be copied to
            FileInputStream originalFile = new FileInputStream("input.txt");
            FileOutputStream copiedFile = new FileOutputStream("copiedFile.txt");

            //use read method to read data from original file
            originalFile.read(array);

            //use write method to write data into new file
            copiedFile.write(array);

            //print message telling user the file was successfully copied
            System.out.println("File was successfully copied");

            //close both files
            originalFile.close();
            copiedFile.close();
        }

        //use catch exceptions clause to prevent errors
        catch (Exception e){
            e.getStackTrace();
        }

    }
}
