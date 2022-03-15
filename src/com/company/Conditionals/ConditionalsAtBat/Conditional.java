package com.company.Conditionals.ConditionalsAtBat;

public class Conditional {
    public static boolean chimpTrouble(boolean aSmile, boolean bSmile)
    {
        return (aSmile == bSmile);
    }

    public static boolean negPos(int a, int b, boolean negative)
    {
        if(negative == false && (a < 0 && b > 0)){
            return true;
        }

        else if(negative == false && ( a > 0 && b < 0)){
            return true;
        }
        else if(negative == true && (a < 0 && b < 0)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean pickUpPhone (boolean isMorning, boolean isMom, boolean isAsleep)
    {
        if (isAsleep)
        {
            return false;
        }
        if ((isMorning && isMom) || !isMorning)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String setAlarm (int a, boolean vacation)
    {
        if (vacation)
        {
            if (a >= 1 && a <= 5)
            {
                return "10:00";
            }
            else
            {
                return "off";
            }
        }
        else if (a >= 1 && a <= 5)
        {
            return "7:00";
        }
        else
        {
            return "10:00";
        }
    }

    public boolean onesDigitSame (int a, int b, int c)
    {
        int d = a % 10;
        int e = b % 10;
        int f = c % 10;

        if (a >= 100)
        {
            d = a % 100;
        }
        if (d == e || d == f)
        {
            return true;
        }
        else if (e == f)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int blackjack(int a, int b)
    {
        int oneNum = a;
        int secNum = b;

        if (oneNum > 21 && secNum > 21)
        {
            return 0;
        }
        if (oneNum == 21 || secNum == 21)
        {
            return 21;
        }
        else if (oneNum == secNum)
        {
            return oneNum;
        }
        else if (oneNum < 21 && secNum > 21)
        {
            return oneNum;
        }
        else return 0;
    }

    public static void main(String[] args) {
        Conditional cont = new Conditional ();

        System.out.println(cont.chimpTrouble(true,true));
        System.out.println(cont.chimpTrouble(false,false));
        System.out.println(cont.chimpTrouble(true,false));
        System.out.println(cont.chimpTrouble(false,true));

        System.out.println();

        System.out.println(cont.negPos(1, -1, false));
        System.out.println(cont.negPos (-1, 1, false));
        System.out.println(cont.negPos(1, 1, false));
        System.out.println(cont.negPos (-1, -1, false));
        System.out.println(cont.negPos (-4, -5, true));
        System.out.println(cont.negPos (-4, 5, true)); // wrong
        System.out.println(cont.negPos (4, 5, true)); // wrong
        System.out.println(cont.negPos (4, -5, true));

        System.out.println();

        System.out.println(cont.pickUpPhone (false, false, true));
        System.out.println(cont.pickUpPhone (true, true, true));
        System.out.println(cont.pickUpPhone (true, true, false));
        System.out.println(cont.pickUpPhone (false, true, false));
        System.out.println(cont.pickUpPhone (true, false, false));
        System.out.println(cont.pickUpPhone (false, false, false));

        System.out.println();

        System.out.println(cont.setAlarm(1, false));
        System.out.println(cont.setAlarm(5, false));
        System.out.println(cont.setAlarm (0, false));
        System.out.println(cont.setAlarm (2, true));
        System.out.println(cont.setAlarm (4, true));
        System.out.println(cont.setAlarm (6, true));

        System.out.println();

        System.out.println(cont.onesDigitSame(23, 19, 13));
        System.out.println(cont.onesDigitSame (23, 19, 12));
        System.out.println(cont.onesDigitSame (23, 19, 3));
        System.out.println(cont.onesDigitSame (423, 13, 3));
        System.out.println(cont.onesDigitSame (23, 29, 25));

        System.out.println();

        System.out.println(cont.blackjack(19, 21));
        System.out.println(cont.blackjack(21, 19));
        System.out.println(cont.blackjack(19, 22));
        System.out.println(cont.blackjack(8, 8));
        System.out.println(cont.blackjack(25, 24));
    }
}

/*
Output

true
true
false
false

true
true
false
false
true
false
false
false

false
false
true
true
false
true

7:00
7:00
10:00
10:00
10:00
off

true
false
true
true
false

21
21
19
8
0

 */