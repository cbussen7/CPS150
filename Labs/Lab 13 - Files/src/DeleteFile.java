/*
Christopher Bussen
CPS 150 02
Lab 13
DeleteFile: no inputs ; String

program checks a certain path and file name on the computer then deletes
the file if it is present

ex1: program will print File was deleted if the path/name are correct and the file is successfully deleted
ex2: program will output File was unable to be deleted if path/name are incorrect or file is not present
 */

import java.io.File;
import java.io.FileNotFoundException;

public class DeleteFile {
    public static void main(String [] args) throws FileNotFoundException {
        //give full file name and path of file to be deleted
        //use file created in WriteFile program
        File createdFile = new File ("/Users/ChristopherBussen/Desktop/UD F2020/CPS 150/Labs/Lab 13 - Files/input.txt");

        //use a boolean variable and the delete method to delete the file
        boolean delete = createdFile.delete();

        if(delete){
            //let user know file was successfully deleted
            System.out.println("File was successfully deleted");
        }
        else{
            //print error message
            System.out.println("File was unable to be deleted");
        }
    }
}
