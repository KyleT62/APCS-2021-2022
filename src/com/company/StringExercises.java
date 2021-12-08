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
        return s.replace("1","0").replace("0","1"); // fix
    }
    public static String dateString(String date){
        return date.replace("/","-");
    }
    public static String dateString2(String date2){
        String str = date2;
        if(str.substring(0,1) == "0"){
            str = str.substring(1);
        }
        return str.replace("/","-");
    }
    public static Boolean startsWith(String s, String prefix){
        
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

        System.out.println();

        System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));

        System.out.println();

        System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + dateString2("4/2/2014"));

        System.out.println();

        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
    }
}
