package com.company;

public class Factorials {
    public int calcFactorial (int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    } //Find out why numbers don't work after about 12 or 13 factorial

    public double calcE(){

        int hold;
        int n = 2;
        double e = 2.0;
        double oldE = 0;

        while (e - oldE > 0.001)
        {

        oldE = e;
        hold = calcFactorial(n);
        n++;
        e += 1.0 / hold;

        }
        return e; //somehow move three decimal places over
    }
    public double calcEX(double x){

        int hold;
        int n = 2;
        int inc = 1;
        double e = 2.0;
        double oldE = 0;

        while (e - oldE > 0.001)
        {

            oldE = e;
            hold = calcFactorial(n);
            n++;
            e += x / hold;
            inc++;

        }
        return e; //fix
    }

    public static void main(String[] args) {
        Factorials test = new Factorials();

        int n = 0;
        for (int i = 1; i <= 20; i++){
            n++;
            System.out.println(test.calcFactorial(n));
        }

        System.out.println();

        System.out.println(test.calcE());

        System.out.println();

        System.out.println(test.calcEX(1));
        System.out.println(test.calcEX(2));
        System.out.println(test.calcEX(3));
    }
}
