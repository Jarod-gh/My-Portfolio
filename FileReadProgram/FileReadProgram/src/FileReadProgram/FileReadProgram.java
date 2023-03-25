/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileReadProgram;

//import statements
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Jarod Conner
 * Purpose: Opens a text file, prints the solar production for each month, and calculates the total.
 */
public class FileReadProgram {

    /**
     * @param args the command line arguments
     */
    //main method
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream = null;
        
        //try catch code
        try {
            inputStream = new FileInputStream("csolar-production.txt");
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
        //initialized variables and scanner
        Scanner userInput = new Scanner(inputStream);
        String month_year;
        int kwh;
        double mwh;
        double totalMWH = 0;
        
        while (userInput.hasNext()) {
            month_year = userInput.next();
            kwh = userInput.nextInt();
            
            //mwh conversion
            mwh = (double) kwh / 1000;
            totalMWH += mwh;
            System.out.printf("%25s had %.2f mwh\n", month_year, mwh);
        } //end while loop
        
        inputStream.close();         //closes file!!!
        System.out.printf("\n%28s %.2f mwh\n" , "Total Production was", totalMWH);
        
        System.out.println("\nEnd of LAB21 Solar Production by: Jarod Conner");
        
    } //end main method
    
} //end class def
