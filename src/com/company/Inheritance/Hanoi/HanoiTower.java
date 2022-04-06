package com.company.Inheritance.Hanoi;

import java.sql.SQLOutput;

public class HanoiTower {
    private Peg peg1;
    private Peg peg2;
    private Peg peg3;
    private int numDiscs;

    public HanoiTower(int num)
    {
        // TODO implement constructor
        numDiscs = num;
        peg1 = new Peg(1,numDiscs);
        peg2 = new Peg(2,numDiscs);
        peg3 = new Peg(3,numDiscs);
        for(int i = numDiscs; i > 0; i--){
            peg1.addDisc(i);
        }
    }
    public void solveTower()
    {

        moveTower(peg1, peg3, peg2, numDiscs);

    }

    private void moveTower(Peg startPeg, Peg endPeg, Peg extraPeg, int numtoMove)
    {
        // TODO move discs(number input) from the start peg to the end peg
        if(numtoMove <= 0){
            return;
        }
        if(numtoMove == 1){
            startPeg.moveTopDisc(endPeg);
            return;
        }
        moveTower(startPeg,extraPeg,endPeg,numtoMove-1);
        startPeg.moveTopDisc(endPeg);
        moveTower(extraPeg,endPeg,startPeg,numtoMove-1);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Five Discs, Steps: 31");
        HanoiTower ht5 = new HanoiTower(5);
        ht5.solveTower();
        System.out.println();

        System.out.println("Three Discs, Steps: 7");
        HanoiTower ht3 = new HanoiTower(3);
        ht3.solveTower();
        System.out.println();
    }
}