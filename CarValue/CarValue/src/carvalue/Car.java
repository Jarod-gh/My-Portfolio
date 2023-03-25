/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carvalue;

/**
 *
 * @author Jarod Conner
 */
public class Car {
    private int purchasePrice;
    private int currentValue;
    private int modelYear;
    
    public void setModelYear(int carYear){   //setter method
        modelYear = carYear;
    }
    
    public int getModelYear(){   //getter method
        return modelYear;
    }
    
    public void setPurchasePrice(int carPrice) {  //setter method
        purchasePrice = carPrice;
    }
    
    public int getPurchasePrice() {       //getter method
        return purchasePrice;
    }
    
    public void calcCurrentValue(int currentYear) {
        double depreciationRate = 0.15;
        int carAge = currentYear - modelYear;
        currentValue = (int) Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
    }
    
    public void printInfo(){
        System.out.println("Car's information:");
        System.out.println("  Model year: " + modelYear);
        System.out.println("  Purchase price: $" + purchasePrice);
        System.out.println("  Current value: $" + currentValue);
    }
}
