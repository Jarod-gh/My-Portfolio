
package petinformation;

//import statement
import java.util.Scanner;

/**
 * PetInformation class to test Pet Superclass and Dog subclass
 * @author Jarod Conner
 * Purpose: Inherit methods from other classes to print dog and pet info.
 * @since  2022-11-16
 */
public class PetInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Scanner scnr = new Scanner(System.in);

        String petName;
        int petAge;

        System.out.print("Pet Name: ");
        petName = scnr.nextLine();
        System.out.print("Pet Age: ");
        petAge = scnr.nextInt();
        scnr.nextLine();

        //Prompt user and capture Dog name, age, and breed
        String dogName, dogBreed;
        int dogAge;
        
        System.out.print("Dog Name: ");
        dogName = scnr.nextLine();
        System.out.print("Dog Age: ");
        dogAge = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Dog Breed: ");
        dogBreed = scnr.nextLine();
        
        // Creates a generic pet (using petName, petAge) and then call printInfo
        Pet myPet = new Pet();
        myPet.setName(petName);
        myPet.setAge(petAge);
        myPet.printInfo();

        //Dog object created and values inserted
        Dog myDog = new Dog();
        myDog.setName(dogName);
        myDog.setAge(dogAge);
        myDog.printInfo();
        myDog.setBreed(dogBreed);
        
        //Dog breed outputted
        System.out.println("   Breed: " + myDog.getBreed());
    }
    
}
