//Nathaniel Marcum
//10/14/20
/*This program is the functionality extension to the FileManager project *C:\Users\BitchCity\IdeaProjcts\*

*/
package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //fileContent: User enters desired file name to create if search == NULL.
        Scanner fileContent = new Scanner(System.in);

        //menuInput: User enters desired action upon entering startup menu
        Scanner menuInput = new Scanner(System.in);

        //Reads entered Scanner
        String fileText = fileContent.nextLine();
        File file = new File(fileText);
        InputStreamReader cin = null;

        //Creates a new file instance
        file.createNewFile();

        //Creates a new fileWriter
        FileWriter fileWriter = new FileWriter(file);

        //Creates file if search is NULL.
        //
        //fileWriter.write();
        fileWriter.flush();
        fileWriter.close();

        //Creating FileReader Object
        FileReader fileReader = new FileReader(file);

        //Creates an array for testing
        char [] a = new char[50];
        //fileReader.read(a);

        System.out.println("What action would you like to perform?");
        System.out.println("(O)pen File\t(S)earch File\t(C)reate File\n(D)elete File\t(E)xit Program");
        menuInput.nextLine();

        //Finish functionality
        switch(menuInput.toString()) {
            case "O":
                //break;
            case "S":
                //break;
            case "C":
                //break;
            case "D":
                //break;
            case "E":
                //break

            default:
                System.out.println("Please enter one of the following options:");
                break;
        }

        /*
        if (menuInput != null) throw InputMismatchException {
            System.out.println("Please enter one of the following options");
        }
        if (menuInput )
        */

        //If statement to check if fileText is NULL, if NULL or not found throw IO Exception.
        /*
        if (fileText == NULL) throwException {
            System.out.println("Value has come back NULL\nPlease try again...");
            }
        if {fileText !

        }

         */
        for (char c : a) {
            System.out.print(c);
        fileReader.close();
        }
        /*try {
            cin = new InputStreamReader(System.in);
            System.out.prinln("Enter a charactrer")
        }*/
    }
}
