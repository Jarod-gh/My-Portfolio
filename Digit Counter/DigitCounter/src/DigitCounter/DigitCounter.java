/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DigitCounter;

import java.util.Scanner;
/**
 *
 * @author Jarod Conner
 * Purpose: Given a int from the user, the program will calculate the number of digits the int have.
 */
public class DigitCounter {
    
    //Method calculating the number of digits.
    public static int digitCount(int paraInt) {
        int digCount = 0;
        
        if (paraInt < 10) {
            return 1;
        }
        
        return 1 + (digitCount(paraInt / 10));
    }
    /**
     * @param args the command line arguments
     */
    //Main Method
    public static void main(String[] args) {
        // TODO code application logic here
        int results;
        int userDigit;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        userDigit = userInput.nextInt();
        results = digitCount(userDigit);
        
        System.out.println("Digit count: " + results);
    }
    
}
