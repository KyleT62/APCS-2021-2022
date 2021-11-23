package com.company;

public class AdvancedForLoops {
    public static void eights() {
        for(int i = 8; i > 0; i -= 2){
            for(int k = i; k < i; k--){ //fix for loop for spaces
                System.out.print("");
            }
            for(int j = i; j > 0; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void alternate(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        eights();
    }
}
