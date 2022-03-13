package com.company;

public class YummyFood {
    public static void main(String[] args) {
        System.out.print("Yummy");
        System.out.println(" Food");
        chocolate();
        iceCream();
        System.out.println("finished with my ice cream");
    }
    public static void chocolate(){
        System.out.println("Chocolate");
    }

    public static void iceCream() {
        System.out.println("Cookies 'n Cream Ice Cream");
        chocolate();
        System.out.println("that was pretty good");
    }
}
