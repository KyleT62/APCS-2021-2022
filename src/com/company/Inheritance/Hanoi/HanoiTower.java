package com.company.Inheritance.Hanoi;

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
        peg2 = new Peg(1,numDiscs);
        peg3 = new Peg(1,numDiscs);
    }
    public void solveTower()
    {
        moveTower(peg1, peg3, peg2, numDiscs);
    }

    private void moveTower(Peg startPeg, Peg endPeg, Peg extraPeg, int numtoMove)
    {
        // TODO move discs(number input) from the start peg to the end peg
        if(numtoMove == 0){
            return;
        }
        if(numtoMove == 1){
            peg1.moveTopDisc(peg3);
        }
        moveTower(peg1,peg3,peg2,numtoMove-1);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HanoiTower ht = new HanoiTower(5);
        ht.solveTower();
    }

}