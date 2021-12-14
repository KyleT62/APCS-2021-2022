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
        return s.replace("1","X").replace("0","1").replace("X","0");
    }
    public static String dateString(String date){
        return date.replace("/","-");
    }
    public static String dateString2(String date2){
        String str = date2;
        if(str.substring(0,2).contains("0") != true){
            str = "0" + str;
        }
        if(str.substring(3,5).contains("0") != true){
            str = str.substring(0,3) + "0" + str.substring(3);
        }
        return str.replace("/","-");
    }
    public static Boolean startsWith(String s, String prefix){
        if(prefix.length() > s.length()){
            return false;
        }
        if(s.substring(0,prefix.length()).compareTo(prefix) == 0){
            return true;
        }
        return false;
    }
    public static boolean endsWith(String s, String suffix){
        if(suffix.length() > s.length()){
            return false;
        }
        if(s.substring(s.length()-suffix.length()).compareTo(suffix) == 0){
            return true;
        }
        return false;
    }
    public static String removeTag(String html, String remove){
        String str = html;
        String startTag = "<" + remove + ">";
        String endTag = "</" + remove + ">";
        if(str.contains(startTag) && str.contains(endTag)){
            if(str.indexOf(startTag,1) <= str.indexOf(endTag,1)) {
                str = html.replace(startTag, "").replace("</" + remove + ">", "");
            }
        }

        return str;
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

        System.out.println("\nstartsWith");

        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));

        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));

        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
                "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}

/*
OUTPUT
ello WorldH
appyh
h

Lori Renee Reubenstein
Joe Biden
Bozo the Clown

1101000110
00000000

04/20/2014 becomes 04-20-2014

04/20/2014 becomes 04-20-2014
4/20/2014 becomes 04-20-2014
04/2/2014 becomes 04-02-2014
4/2/2014 becomes 04-02-2014

startsWith
true
true
false
false
true

endsWith
true
true
false
false
true

removeTag
Hello World
<b>Hello World</b>
Hello World</b>
<b>Hello World
</img>Hello World<img>
Happy Birthday Hello World
Hello World Happy Birthday
Happy Hello World Birthday
 */
