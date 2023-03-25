/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trianglearea;

import java.util.Scanner;
/**
 *
 * @author Jarod Conner
 * Purpose: Program gets measurements for two triangles and determines which triangle is smaller.
 */
public class TriangleArea {

    /**
     * @param args the command line arguments
     */
    //Main Method
    public static void main(String[] args) {
        //Declares all variables
        Scanner userInput = new Scanner(System.in);
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        
        double userBase1, userHeight1, userBase2, userHeight2;
        
        //Obtains all values from user
        System.out.print("Enter the base and height for triangle1 (in inches): ");
        userBase1 = userInput.nextDouble();
        userHeight1 = userInput.nextDouble();
        
        System.out.print("Enter the base and height for triangle2 (in inches): ");
        userBase2 = userInput.nextDouble();
        userHeight2 = userInput.nextDouble();
        
        //calls methods to set values and calculate area for each triangle
        triangle1.setBase(userBase1);
        triangle1.setHeight(userHeight1);
        
        triangle2.setBase(userBase2);
        triangle2.setHeight(userHeight2);
        
        //determines and prints triangle info with smaller area
        System.out.println("Triangle with smaller area:");
        if (triangle1.getArea(userBase1, userHeight1) > triangle2.getArea(userBase2, userHeight2)) {
            triangle2.printInfo();
        }
        
        else {
            triangle1.printInfo();
        }
        
    }
    
}
