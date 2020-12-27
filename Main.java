//Nathaniel Marcum
//10/14/20
/*This program is the functionality extension to the FileManager project *C:\Users\BitchCity\IdeaProjcts\*

*/

package com.company;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.logging.FileHandler;


public class Main {
    public static void main(String[] args) throws IOException {

        // String for fileContent
        String s = "";
        //fileContent: User enters desired file name to create if search == NULL.
        Scanner fileContent = new Scanner(s);
        fileContent.close();


        /*Reads entered Scanner


        System.out.println("(O)pen File\t(S)earch File\t(C)reate File\n(D)elete File\t(E)xit Program");
        System.out.println("What action would you like to perform?");

        //menuInput: User enters desired action upon entering startup menu
        Scanner menuInput = new Scanner(System.in);
        menuInput.nextLine();

        if(menuInput.) {
            return
        }


        // Switch case statement for file menu options


        //Leave for testing reasons
        /*for (char c : a) {
            System.out.print(c);
        fileReader.close();
        }*/
    }

    public static void FileHandler(String fileContent, File file) throws IOException, SecurityException {

        File[] fileList = file.listFiles();
        System.out.println("What file would you like to search for?");

        /*if (findFile(file) == ) {
            try {
                if (fileName == null) {
                    System.out.println("Please enter a valid file/location");
                    file.isFile();
                    //findFile(fileName);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
            }
        }*/

    }

    public String toString() {

    }
}