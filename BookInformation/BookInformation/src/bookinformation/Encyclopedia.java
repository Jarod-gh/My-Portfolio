/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookinformation;

/**
 *
 * @author Jarod Conner
 */
public class Encyclopedia extends Book {
    private String edition;
    private int numVolumes;
    
    public void setEdition(String e) {
        this.edition = e;
    }
    
    public String getEdition() {
        return this.edition;
    }
    
    public void setNumVolumes(int v) {
        this.numVolumes = v;
    }
    
    public int getNumVolumes() {
        return this.numVolumes;
    }
    
    @Override
    public void printInfo() {
       System.out.println("Book Information: ");
       System.out.println("   Book Title: " + title);
       System.out.println("   Author: " + author);
       System.out.println("   Publisher: " + publisher);
       System.out.println("   Publication Date: " + publicationDate);
       System.out.println("   Edition: " + edition);
       System.out.println("   Number of Volumes: " + numVolumes);
    }
}
