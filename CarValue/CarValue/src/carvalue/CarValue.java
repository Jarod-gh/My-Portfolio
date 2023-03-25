/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carvalue;

import java.util.Scanner;
/**
 *
 * @author Jarod Conner
 * Purpose: Program inherits a the 'Car' Class and determines the value from user input.
 */
public class CarValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        Car myCar = new Car();      //Created Car class instance 
        
        //Input from user needed to calculate value
        System.out.print("Year: ");
        int userYear = userInput.nextInt();
        System.out.print("Purchase Price: ");
        int userPrice = userInput.nextInt();
        System.out.print("Current Year: ");
        int userCurrentYear = userInput.nextInt();
        
        //Calling methods from Car class instance.
        myCar.setModelYear(userYear);
        myCar.setPurchasePrice(userPrice);
        myCar.calcCurrentValue(userCurrentYear);
        myCar.printInfo();
    }
    
}
