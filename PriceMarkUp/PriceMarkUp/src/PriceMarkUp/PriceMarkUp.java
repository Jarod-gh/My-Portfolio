/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PriceMarkUp;

import java.util.Scanner;
/**
 *
 * @author Jarod Conner
 * Purpose: Program takes a price and uses a percentage to mark the price up.
 */
public class PriceMarkUp {
    
    //Method to markup retail cost.
    public static double retail_cost(double param_wholesale, double param_markupPercentage) {
        double retailCost = param_wholesale * (1 + param_markupPercentage);
        
        return retailCost;
    } //retail_cost method end
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double wholesale_cost;
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Enter the wholesale cost, numbers and decimals only: ");
        wholesale_cost = scnr.nextDouble();
        
        System.out.print("Enter the markup percentage: ");
        double markupPercentage = scnr.nextDouble();
        
        double retail;
        retail = retail_cost(wholesale_cost, markupPercentage);
        
        System.out.println("End or Retail Cost, LAB16 by Jarod Conner");
        System.out.printf("The retail cost is: %.2f \n", retail);
    } //end main method
    
}
