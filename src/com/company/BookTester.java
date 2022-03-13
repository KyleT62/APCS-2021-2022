package com.company;
import java.util.ArrayList;

public class BookTester{
    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<>();
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W Denslow");

        myLibrary.add(book1);
        myLibrary.add(book2);

        for(int i = 0; i < myLibrary.size(); i++){
            myLibrary.get(i).printBookInfo();
            System.out.println();
        }

        System.out.println();

        BookListing listing1 = new BookListing(book1, 10.99);
        BookListing listing2 = new BookListing(book2, 12.99);

        listing1.printDescription();
        listing2.printDescription();
    }
}
