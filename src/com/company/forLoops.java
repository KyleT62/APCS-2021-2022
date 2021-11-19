package com.company;

public class forLoops {
    public int addEvens(int n){
        int sum = 0;

        for (int i = 0; i <= n; i++)
            if (i % 2 == 0){
                sum += i;
            }
        return sum;
    }

    public void printSquaresBack (int n){
        for (int i = n; i > 0; i--)
            System.out.println(i*i);
    }

    public void sillyNumbers() {
        for(int i = 0; i < 9; i++)
            for(int b = i; b )
    }

    public static void main(String[] args) {
        forLoops test = new forLoops();

        int n = 7;
        for (int i = 0; i < 3; i++) {
            System.out.println(test.addEvens(n));
            n++;
        }

        System.out.println();

        test.printSquaresBack(8);
    }
}
