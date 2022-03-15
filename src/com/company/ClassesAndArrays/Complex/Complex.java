package com.company.ClassesAndArrays.Complex;

public class Complex {
    private double a;
    private double b;

    public Complex(int x, int y){
        a = x;
        b = y;
    }
    public Complex(int x){
        a = x;
        b = 0.0;
    }

    public double abs(){
        return (Math.sqrt(a*a) + Math.sqrt(b*b));
    }
    public double add(Complex other){
        return ((a + other.a) + (b + other.b));
    }
    public double add(double g, double f){
        return ((a + g) + (b + f));
    }
    public double multiply(Complex other){
        return (a + b)*(other.a + other.b)*-1;
    }
    public double multiply(double j, double k){
        return (a + b)*(j + k)*-1;
    }
    public String toString(){
        return a + " + " + b + "i";
    }

    public static void main(String[] args) {
        Complex test1 = new Complex(6,4);
        Complex test2 = new Complex(5);
        Complex test3 = new Complex(0,-3);
        Complex test4 = new Complex(-7,-1);
        Complex test5 = new Complex(2,-2);
        Complex test6 = new Complex(-6,3);

        System.out.println(test1.abs());
        System.out.println(test2.add(test3));
        System.out.println(test4.add(2,1));
        System.out.println(test5.multiply(test6));
        System.out.println(test3.multiply(0,6));
        System.out.println(test4);
        System.out.println(test6);
        System.out.println(test2.multiply(test4));
        System.out.println(test4.abs());
        System.out.println(test5.add(-4,5));
        System.out.println(test2.multiply(-6,-1));
        System.out.println(test1.add(test4));


    }
}

/*
OUTPUT:
10.0
2.0
-5.0
0.0
18.0
-7.0 + -1.0i
-6.0 + 3.0i
40.0
8.0
1.0
35.0
2.0
 */