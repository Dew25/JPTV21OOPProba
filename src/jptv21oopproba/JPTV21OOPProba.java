/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21oopproba;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author Melnikov
 */
public class JPTV21OOPProba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Author author1 = new Author();
       author1.setFirstname("Aleksandr");
       author1.setLastname("Pushkin");
       Book book = new Book();
       book.setCaption("Jevgeny Onegin");
       Author[] authors = new Author[1];
       authors[0] = author1;
       book.setAuthors(authors);
        System.out.println(book.toString());
        
       Book book2 = new Book();
       book2.setCaption("Zolotoy teljonok");
       Author author2 = new Author();
       author2.setFirstname("Ilja");
       author2.setLastname("Ilf");
       Author author3 = new Author();
       author3.setFirstname("Jevgeny");
       author3.setLastname("Petrov");
       Author[] authors2 = new Author[2];
       authors2[0]=author2;
       authors2[1]=author3;
       book2.setAuthors(authors2);
        System.out.println(book2.toString());
       
    }
    
}
