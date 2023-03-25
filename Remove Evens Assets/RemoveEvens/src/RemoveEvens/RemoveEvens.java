/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RemoveEvens;
import java.util.Arrays;
/**
 *
 * @author Jarod Conner
 * Purpose: Program removes any even numbers in the given array.
 */
public class RemoveEvens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Initializes array and calls function to remove evens.
        int[] input = new int[] {1,2,3,4,5,6,7,8,9};
        int[] result = removeEvens(input);
        System.out.println(Arrays.toString(result));
    }
    
    //Function to remove evens
    public static int[] removeEvens(int[] nums) {
        int countOdds = 0;
        for (int i: nums) {
            if(Math.abs(i) % 2 == 1)
                countOdds++;
        }
        
        int[] odds = new int[countOdds];
        
        int index = 0;
        for (int i : nums) {
            if(Math.abs(i) % 2 == 1) {
                odds[index] = i;
                index++;
            }
        }
        return odds;
    }
}
