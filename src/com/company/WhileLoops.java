package com.company;

public class WhileLoops {
    public static int addOdds (int n)
    {
        int count = 1;
        int a = 0;
        while (count <= n)
        {
            if (count % 2 != 0){
                a += count;
            }
            count++;
        }
        return a;
    }

    public int sumDigits(int a){
        int count = 0;
        int sum = 0;
        while(count <= a)
        {

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addOdds(10));
        System.out.println(addOdds(16));
        System.out.println(addOdds(20));
    }
}
