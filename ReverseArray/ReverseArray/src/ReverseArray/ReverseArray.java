/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ReverseArray;

/**
 *
 * @author Jarod Conner
 * Purpose: Program takes an array given to it and reverse the order of its contents.
 */
public class ReverseArray {
    
    //Function to reverse order of array.
    public static void reverse(char[] charArray) {
        int n = 0;
        char[] results = new char[charArray.length];
        
        for (int i = charArray.length - 1; i >= 0; i--) {
            results[n] = charArray[i];
            System.out.print(results[n]);
            if (i != 0)
                System.out.print(" ");
            else
                System.out.println();
            n++;
        }
    }
    /**
     * @param args the command line arguments
     */
    
    //Main function, creates an array and calls reverse function.
    public static void main(String[] args) {
        // TODO code application logic here
        char[] input = new char[] {'a', 'b', 'c'};
        
        reverse(input);
    }
    
}
