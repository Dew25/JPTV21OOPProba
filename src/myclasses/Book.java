/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;

/**
 *
 * @author Melnikov
 */
public class Book {
    private Author[] authors = new Author[0];
    private String caption;

    public Book() {
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    public void addAuthor(Author author){
        int countAuthors = this.authors.length;
        Author[] newAuthors = Arrays.copyOf(this.authors, countAuthors+1);
        newAuthors[countAuthors] = author;
        this.authors = newAuthors;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "Book{" 
                + ",\n caption=" + caption 
                + "\n authors=" + Arrays.toString(authors)
                + "\n"+'}';
    }
    
}
