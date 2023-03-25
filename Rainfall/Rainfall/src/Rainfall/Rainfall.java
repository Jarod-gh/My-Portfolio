/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Rainfall;

//import statements
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

/**
 *
 * @author Jarod Conner
 * Purpose: Program opens file on rainfall and calculates the total, average, max, and min for the year.
 */
public class Rainfall {

    /**
     * @param args the command line arguments
     */
    //Main method
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        FileInputStream inputStream = null;
        
        //try catch block
        try {
            inputStream = new FileInputStream("rainFall.txt");
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
        //initialization of variables + scanner.
        Scanner userInput = new Scanner(inputStream);
        String currentMonth = userInput.next();
        double currentRainfall = userInput.nextDouble();
        
        String smallestMonth = currentMonth, largestMonth = currentMonth;
        double smallestRainfall = currentRainfall, largestRainfall = currentRainfall, totalRainfall = currentRainfall;
        
        //while loop
        while(userInput.hasNext()) {
            currentMonth = userInput.next();
            currentRainfall = userInput.nextDouble();
            
            if (currentRainfall > largestRainfall) {
                largestMonth = currentMonth;
                largestRainfall = currentRainfall;
                totalRainfall += currentRainfall;
            }
            
            else if (currentRainfall < smallestRainfall) {
                smallestMonth = currentMonth;
                smallestRainfall = currentRainfall;
                totalRainfall += currentRainfall;
            }
            
            else {
                totalRainfall += currentRainfall;
            }   //end if statement
            
            
        } //end while loop
        
        //close file
        inputStream.close();
        
        double avgRainfall = (totalRainfall) / 12;
        
        //print statements
        System.out.printf("Total rainfall for 2018 was: %.2f\n", totalRainfall);
        System.out.printf("The average rainfall for the year: %.2f\n", avgRainfall);
        System.out.printf(largestMonth + " had the most rain: %.2f\n", largestRainfall);
        System.out.printf(smallestMonth + " had the least rain: %.2f\n", smallestRainfall);
        System.out.println("\nEnd of LAB22 Rainfall Analysis by: Jarod Conner");
    } //end of main method
    
} //end of class def
