package com.company.Conditionals.Conditionials.java;

public class MoreConditionals {

    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isLater (int month1, int day1, int year1, int month2, int day2, int year2){
        if (month1 * 30 + day1 + year1 * 365 > month2 * 30 + day2 + year2 * 365){
            return true;
        }
        else{
            return false;
        }
    }

    public static int findBestFit (int size1, int size2, int space)
    {
        int best;
        int comb = size1 + size2;

        if (comb >= space)
        {
            if (size1 > space && size2 > space)
            {
                best = 0;
            }
            else if (size1 > size2 && size1 < space)
            {
                best = 1;
            }
            else if (size2 > size1 && size2 < space)
            {
                best = 2;
            }
            else if (size2 < size1 && size2 < space)
            {
                best = 2;
            }
            else
            {
                best = 1;
            }
        }
        else
        {
            best = 3;
        }
        return best;
    }

    public static boolean makeBench (int small, int big, int goal)
    {
        int biggie = big * 5;
        int total = small + biggie;
        if (total == goal)
        {
            if (total < goal)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else if (small == goal && biggie == 0 || biggie == goal && small == 0)
        {
            return true;
        }
        else if (total > goal)
        {
            if (small - 1 + biggie == goal)
            {
                return true;
            }
            else if (small - 3 + biggie == goal)
            {
                return true;
            }
            else if (small - 2 + biggie - 5 != goal)
            {
                return true;
            }
            else return false;
        }
        else return false;
    }

    public static void main(String[] args) {

        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2004 " + isLeapYear(2004));
        System.out.println("2003 " + isLeapYear(2003));
        System.out.println("2100 " + isLeapYear(2100));

        System.out.println();

        System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
        System.out.println("2/1/2011 is later than 2/2/2010 " + isLater(2,1,2011, 2,2,2010));
        System.out.println("1/2/2011 is later than 2/2/2010 " + isLater(1,2,2011, 2,2,2010));
        System.out.println("1/5/2010 is later than 3/2/2010 " + isLater(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
        System.out.println("5/2/2010 is later than 1/3/2011 " + isLater(5,2,2010, 1,3,2011));
        System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is later than 1/2/2010 " + isLater(4,8,2010, 1,2,2010));

        System.out.println();

        System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
        System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
        System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
        System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
        System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
        System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));

        System.out.println();

        System.out.println("Make bench 3 1 8 is " + makeBench(3,1,8));
        System.out.println("Make bench 3 1 9 is " + makeBench(3,1,9));
        System.out.println("Make bench 11 1 15 is " + makeBench(11,1,15));
        System.out.println("Make bench 4 2 15 is " + makeBench(4,2,15));
        System.out.println("Make bench 20 0 20 is " + makeBench(20,0,20));
        System.out.println("Make bench 3 4 20 is " + makeBench(3,4,20));
        System.out.println("Make bench 0 6 30 is " + makeBench(0,6,30));
        System.out.println("Make bench 0 5 30 is " + makeBench(0,5,30));
        System.out.println("Make bench 2 6 23 is " + makeBench(2,6,23));
    }
}

/*
OutPut:
2000 true
2004 true
2003 false
2100 false
1/2/2010 is later than 1/2/2011 false
2/1/2011 is later than 2/2/2010 true
1/2/2011 is later than 2/2/2010 true
1/5/2010 is later than 3/2/2010 false
3/2/2010 is later than 1/2/2010 true
1/3/2010 is later than 1/2/2010 true
5/2/2010 is later than 1/3/2011 false
1/2/2010 is later than 1/2/2010 false
4/8/2010 is later than 1/2/2010 true
Find Best fit 2 3 6 is 3
Find Best fit 4 3 6 is 1
Find Best fit 3 4 6 is 2
Find Best fit 2 3 1 is 0
Find Best fit 6 3 4 is 2
Find Best fit 3 6 4 is 1
Make bench 3 1 8 is true
Make bench 3 1 9 is false
Make bench 11 1 15 is true
Make bench 4 2 15 is false
Make bench 20 0 20 is true
Make bench 3 4 20 is true
Make bench 0 6 30 is true
Make bench 0 5 30 is false
Make bench 2 6 23 is true
*/