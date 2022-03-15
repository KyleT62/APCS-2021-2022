package com.company.Conditionals.Craps;

public class Die {
    private int numDots;

    public void roll ()
    {
        int a = (int) (Math.random()* 6 + 1);
        numDots = a;
    }
    public int getNumDots ()
    {
        return numDots;
    }

    public static void main(String[] args) {
// TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
}