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

    public static int sumDigits(int a){
        int hold;
        int temp;
        int sum = 0;
        while(sum >= 0)
        {
            temp = a % 10;
            hold  = temp / 10;
            sum += hold;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addOdds(10));
        System.out.println(addOdds(16));
        System.out.println(addOdds(20));

        System.out.println();

        System.out.println(sumDigits(123));
    }
}
