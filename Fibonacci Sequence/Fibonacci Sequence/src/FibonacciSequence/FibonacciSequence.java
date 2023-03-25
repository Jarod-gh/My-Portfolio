/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FibonacciSequence;

import java.util.Scanner;
/**
 *
 * @author Jarod Conner
 * Purpose: Program gets last number in fibonacci sequence for a number given by user.
 */
public class FibonacciSequence {
    
    //Method to find the fibonacci number of a starting number.
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        else if (n <= 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    } //end fibonacci method
    /**
     * @param args the command line arguments
     */
    
    //Main method
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number to find last number in the fibonacci sequence for : ");
        int startNumber = userInput.nextInt();
        
        System.out.println("fibonacci(" + startNumber + ") is " + fibonacci(startNumber));
        
    } //end main method
    
} //end class
