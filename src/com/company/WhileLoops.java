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
        while(a > 0)
        {
            temp = a % 10;
            sum += temp;
            hold  = a / 10;
            a = hold;
        }
        return sum;
    }

    public static int howManyYears (double startpop, double endpop)
    {
        double rate = 0.0113;
        double growing = 0;
        double curUntil = 0;
        int years = 0;

        while (curUntil < endpop)
        {
            growing += (endpop * rate);
            curUntil = growing + startpop;
            years++;
        }
        return years;
    }

    public static int printSum (int n)
    {
        int sum = 0;
        int update = 0;

        while (n > 0)
        {
            sum += n;
            update += sum;
            sum = 0;
            n--;
        }
        return update;
    }

    public static boolean isPerfectSquare (int n)
    {

    }

    public static void main(String[] args) {
        System.out.println(addOdds(10));
        System.out.println(addOdds(16));
        System.out.println(addOdds(20));

        System.out.println();

        System.out.println(sumDigits(123));
        System.out.println(sumDigits(100));
        System.out.println(sumDigits(96820));

        System.out.println();

        System.out.println(howManyYears(111.2,120));
        System.out.println(howManyYears(111.2,150));

        System.out.println();

        System.out.println(printSum(6));
        System.out.println(printSum(12));
        System.out.println(printSum(2));

    }
}
