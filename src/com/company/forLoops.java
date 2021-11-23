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
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k < 3; k++)
                    System.out.print(j);
            }
            System.out.println();
        }
    }

    public void sillyNumbers2() {
        for (int i = 0; i < 3; i++) {
            for (int k = 9; k > 0; k--) {
                for (int j = k; j > 0; j--)
                    System.out.print(k);
            }
            System.out.println();
        }
    }

    public void dollarsAndStars() {
        for (int i = 7; i > 0; i--){
            for ( int t = 7; t > i; t--){
                System.out.print("**");
            }
            for (int a = 0; a < i; a++) {
                System.out.print("$");
            }
            for ( int y = i; y > 0; y--){
                System.out.print("*");
            }
            for (int b = 0; i > b; b++)
                System.out.print("*");
            for (int j = i; j > 0; j--){
                System.out.print("$");
            }
            for (int k = 7; k > i; k--) {
                System.out.print("**");
            }
            System.out.println();
        }
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

        System.out.println();

        test.sillyNumbers();

        System.out.println();

        test.sillyNumbers2();

        System.out.println();

        test.dollarsAndStars();
    }
}

/*
OUTPUT
12
20
20

64
49
36
25
16
9
4
1

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999

999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************
 */
