package com.company.Inheritance.Poem;

public class Poem {
    private int numLines;

    public Poem(int k){
        numLines = k;
    }
    public int getNumlines() {
        return numLines;
    }
    public void printRhythm(){
        System.out.println("Free Verse!");
    }
    public void SpecialRhythm(int k){
        for(int i = 1; i <= k; i++){
            if(i == k) {
                System.out.println("ta");
            }
            else {
                System.out.print("ta-");
            }
        }
    }
}