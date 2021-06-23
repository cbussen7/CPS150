/*
Christopher Bussen
CPS 150 02
Lab 13
RenameFile: no inputs ; string

program specifies a file name and path and then renames the file

ex1: program will print File was successfully renamed if the path/name are correct and the file is successfully renamed
ex2: program will output File was not renamed if path/name are incorrect or file is not present
 */

import java.io.File;
import java.io.FileNotFoundException;

public class RenameFile {
public static void main(String [] args) throws FileNotFoundException{
    //give full path and name of file that will be renamed
    //use file created in WriteFile program
    File createdFile = new File("/Users/ChristopherBussen/Desktop/UD F2020/CPS 150/Labs/Lab 13 - Files/input.txt");

    //create a File object with the new file name
    File renamedFile = new File("RenamedFile.txt");

    //use a boolean variable and the renameTo method to rename the file
    boolean rename = createdFile.renameTo(renamedFile);

    //if the file is renamed, tell the user - otherwise print an error message
    if(rename){
        System.out.println("File was successfully renamed");
    }
    else{
        System.out.println("File was not renamed");
    }
}
}
