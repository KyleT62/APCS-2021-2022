package com.company;

public class MathEx {
    public static int digitSwapper(int input) {
        int one = (input % 10);
        int ten = (input % 100) - one;
        int numbefore = input - one - ten;
        one *= 10;
        ten /= 10;
        int answer = numbefore + one + ten;
        System.out.println(answer);
        return answer;
    }

    public static void timeDep(int curHour, int curMin, int depHour, int depMin) {
        int curTime = (curHour * 60) + curMin;
        int depTime = (depHour * 60) + depMin;
        int timeHour = (depTime - curTime) / 60;
        int timeMin = (depTime - curTime) % 60;
        System.out.println(timeHour + " hour(s) and " + timeMin + " minute(s)");


    }

    public static int dotw(int dayofweek, int date) {
        int d = ((date - 1) % 7) + dayofweek;
        int daysLeft = date - 1;
        return (daysLeft + dayofweek) % 7;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input + " " + output);

        timeDep(1, 34, 8, 20);
        timeDep(1, 15, 4, 36);

        System.out.println(dotw(0, 1));
        System.out.println(dotw(0, 14));
        System.out.println(dotw(6, 22));
        System.out.println(dotw(5, 4));
        System.out.println(dotw(1, 24));
        System.out.println(dotw(2, 1));

    }
}
/*
132
123 132
60
6 60
318
381 318
6 hour(s) and 46 minute(s)
3 hour(s) and 21 minute(s)
0
6
6
1
3
2
 */
