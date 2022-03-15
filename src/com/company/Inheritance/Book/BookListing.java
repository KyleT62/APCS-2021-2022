package com.company.Inheritance.Book;
public class BookListing {
    public Book book;
    public double Price;

    public BookListing(Book a, double b){
        book = a;
        Price = b;
    }
    public void printDescription(){
        book.printBookInfo();
        System.out.println(", $" + Price);
    }
}
