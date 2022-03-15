package com.company.Inheritance.Book;

public class PictureBook extends Book {
    private String illustrator;
    public PictureBook(String a, String b, String c){
        super(a,b);
        illustrator = c;
    }
    public void printBookInfo(){
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}
