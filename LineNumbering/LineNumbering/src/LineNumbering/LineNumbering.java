/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LineNumbering;

//import statements
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.PrintWriter;

/**
 * Lab 23
 * @author Jarod Conner
 * Purpose: Program gets in file from user and creates an out file if it doesn't exist.
 * Updates out file with numbering.
 * @since 2022-11-16
 */
public class LineNumbering {

    /**
     * @param args the command line arguments
     */
    //Main method
    public static void main(String[] args)throws IOException {
        String inFileName, outFileName;
        Scanner keyboard = new Scanner(System.in);
        
        //gets in and outfile name from user
        System.out.print("Enter the input file name (including file type): ");
        inFileName = keyboard.nextLine();
        System.out.print("Enter the output file name(including file type): ");
        outFileName = keyboard.nextLine();
        
        FileInputStream inputStream = null;
        
        //file declared and if statement ending if outfile already exists
        File outfile = new File(outFileName);
        if (outfile.exists()) {
            System.out.println("File already exists! Ending program!");
            System.exit(0);
        }
        
        //try catch
        try {
            inputStream = new FileInputStream(inFileName);
        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } //ends program if error
        
        Scanner inputScanner = new Scanner(inputStream);
        FileOutputStream outputStream = null;
        PrintWriter outputFile = null;
        int n = 1;
        
        outputStream = new FileOutputStream(outFileName);
        outputFile = new PrintWriter(outputStream);
        
        String currentString, outputString;
        
        while (inputScanner.hasNext()) {
            currentString = inputScanner.nextLine();
            outputString = n + ": " + currentString;
            outputFile.println(outputString);
            n += 1;
        } //end while loop
        
        outputFile.flush();
        inputStream.close();
        outputStream.close();
        
        System.out.printf("\nEnd of LAB23: Line Numbering By: Jarod Conner\n");
    } //end main method
    
} //end class def
