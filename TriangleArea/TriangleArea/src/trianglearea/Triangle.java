/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trianglearea;

/**
 *
 * @author conne
 */
public class Triangle {
    private double triangleBase;
    private double triangleHeight;
    private double triangleArea;
    
    public void setBase(double triBase) throws IllegalArgumentException{  //setter
        if(triBase <= 0.0) {
            throw new IllegalArgumentException("Cannot be less than 0");
        }
        triangleBase = triBase;
    }
    
    public void setHeight(double triHeight) throws IllegalArgumentException{
        if (triHeight <= 0.0) {
            throw new IllegalArgumentException("Cannot be less than 0");
        }
        triangleHeight = triHeight;
    }
    
    public double getArea(double triBase, double triHeight) {
        triangleArea = ((triBase * triHeight) / 2);
        return triangleArea;
    }
    
    public void printInfo() {
        System.out.printf("Base: %.2f\n", triangleBase);
        System.out.printf("Height: %.2f\n", triangleHeight);
        System.out.printf("Area: %.2f\n", triangleArea);
    }
}
    