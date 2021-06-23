/*
Christopher Bussen
CPS 150 02
Lab 13
ListFilesInDirectory: no inputs ; string

program lists all of the files in a given directory
 */

import java.io.File;

public class ListFilesInDirectory {
    public static void main(String [] args){
        //specify the given directory of the files you want listed
        //for this problem, I will use a folder of the syllabi of my classes
        File directory = new File("/Users/ChristopherBussen/Desktop/UD F2020/Syllabi");

        //create an array of the files using the list method
        String [] listOfFiles = directory.list();

        //print the list of files using a for loop
        for(int i = 0; i < listOfFiles.length; i++){
            System.out.println(listOfFiles[i]);
        }
    }
}
