package com.company;

public class Factorials {
    public long calcFactorial (int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public double calcE(){

        long hold;
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
        return e;
    }
    public double calcEX(double x){
        double e = 1.0;
        double oldE = 0;
        double count = 1;
        double exp;

        while (e - oldE > 0.001)
        {
            oldE = e;
            exp = Math.pow(x,count);
            e += exp / calcFactorial((int) count);
            count++;
        }
        return e;
    }

    public static void main(String[] args) {
        Factorials test = new Factorials();

        int n = 1;
        for (int i = 1; i <= 20; i++){
            System.out.println(test.calcFactorial(n));
            n++;
        }

        System.out.println();

        System.out.printf("e is %2.3f \n", test.calcE());

        System.out.println();

        int a = 1;
        for (int i = 1; i < 6; i++){
            System.out.printf("e is %2.3f \n", test.calcEX(a));
            a++;
        }
    }

}

/*
OUTPUT

1
2
6
24
120
720
5040
40320
362880
3628800
39916800
479001600
6227020800
87178291200
1307674368000
20922789888000
355687428096000
6402373705728000
121645100408832000
2432902008176640000

e is 2.718

e is 2.718
e is 7.389
e is 20.085
e is 54.598
e is 148.413
 */
