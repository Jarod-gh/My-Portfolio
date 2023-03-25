/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookinformation;

import java.util.Scanner;
/**
 *
 * @author Jarod Conner
 * Purpose: Inherits methods from Book and Encyclopedia classes. Uses classes to obtain and print book and
 * encyclopedia info.
 */
public class BookInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Book myBook = new Book();
        String title, author, publisher, publicationDate;
        
        //prompts for all book information needed
        System.out.print("Book Title: ");
        title = scnr.nextLine();
        System.out.print("Book Author: ");
        author = scnr.nextLine();
        System.out.print("Book Publisher: ");
        publisher = scnr.nextLine();
        System.out.print("Book Publication Date: ");
        publicationDate = scnr.nextLine();
        
        //sets all variables in Book
        myBook.setTitle(title);
        myBook.setAuthor(author);
        myBook.setPublisher(publisher);
        myBook.setPublicationDate(publicationDate);
        
        //initializing Encyclopedia and variables for it
        Encyclopedia myEncyclopedia = new Encyclopedia();
        String etitle, eauthor, epublisher, epublicationDate, edition;
        int Volumes;
        
        //prompts for all Encyclopedia variables needed
        System.out.print("Encyclopedia Title: ");
        etitle = scnr.nextLine();
        System.out.print("Encyclopedia Author: ");
        eauthor = scnr.nextLine();
        System.out.print("Encyclopedia Publisher: ");
        epublisher = scnr.nextLine();
        System.out.print("Encyclopedia Publication Date: ");
        epublicationDate = scnr.nextLine();
        System.out.print("Encyclopedia Edition: ");
        edition = scnr.nextLine();
        System.out.print("Encyclopedia Number of Volumes: ");
        Volumes = scnr.nextInt();
        
        //sets all variables in myEncyclopedia
        myEncyclopedia.setTitle(etitle);
        myEncyclopedia.setAuthor(eauthor);
        myEncyclopedia.setPublisher(epublisher);
        myEncyclopedia.setPublicationDate(epublicationDate);
        myEncyclopedia.setEdition(edition);
        myEncyclopedia.setNumVolumes(Volumes);
        
        //prints all info for book and Encyclopedia
        myBook.printInfo();
        myEncyclopedia.printInfo();
        
        
    }
    
}
