/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petinformation;

/**
 *
 * @author Jarod Conner
 */
public class Dog extends Pet {
    private String dogBreed;
    
    public void setBreed(String b) {
        dogBreed = b;
    }
    
    public String getBreed() {
        return dogBreed;
    }
}