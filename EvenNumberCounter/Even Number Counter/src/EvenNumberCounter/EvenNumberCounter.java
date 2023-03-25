/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EvenNumberCounter;
import java.util.Scanner;
/**
 *
 * @author Jarod Conner
 * Purpose: Program asks the user for 4 numbers and returns the counted amount of even numbers.
 */
public class EvenNumberCounter{
    
    //Function to count even numbers.
    public static int countEvens(int num1, int num2, int num3, int num4) {
        int evenCount = 0;
        if (num1 % 2 == 0)
            evenCount++;
        if (num2 % 2 == 0)
            evenCount++;
        if (num3 % 2 == 0)
            evenCount++;
        if (num4 % 2 == 0)
            evenCount++;
        return evenCount;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Main Function, gets 4 numbers from user and calls count even function.
        int num1, num2, num3, num4;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter four numbers: ");
        num1 = userInput.nextInt();
        num2 = userInput.nextInt();
        num3 = userInput.nextInt();
        num4 = userInput.nextInt();
        
        int results = countEvens(num1, num2, num3, num4);
        System.out.println("Total evens: " + results);
    }
    
}
