package com.company;

public class StringExercises {
    public static String scroll(String s){
        String scr = s.substring(1) + s.substring(0,1);
        return scr;
    }
    public static String convertName(String s){
        s = s.trim();
        String name = s.substring(s.indexOf(",") +1)+ " " + s.substring(0,s.indexOf(","));
        return name.trim();
    }
    public static String negative(String s){

        return s.replace("1","0");
    }

    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));

        System.out.println();

        System.out.println(convertName(" Reubenstein, Lori Renee     "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));

        System.out.println();

        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));

    }
}
