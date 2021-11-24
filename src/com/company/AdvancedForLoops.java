package com.company;

public class AdvancedForLoops {
    public static void eights() {
        for(int i = 8; i > 0; i -= 2){
            for ( int t = 8; t > i; t -= 2){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void alternate(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i && i % 2 != 0; j++) {
                System.out.print(j);
            }
            for (int k = i; k >= 1 && i % 2 == 0; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void isosceles(int n){
        for (int i = 1; i <= n; i++){
            for(int k = n - i; k > 0; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int v = i - 1; v >= 1; v--){
                System.out.print(v);
            }

            System.out.println();
        }
    }

    public static void upSideDown(int end, int start) {
        for(int i = 1; i <= start; i++){
            for(int k = i - 1; k >= 1; k--){
                System.out.print(" ");
            }
            for(int b = end - i + 1; b> start; b-- ){
                System.out.print(b);
            }
            for(int j = start; j <= end - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        eights();

        System.out.println();

        alternate(6);

        System.out.println();

        alternate(5);

        System.out.println();

        isosceles(5);

        System.out.println();

        upSideDown(9,5);

        System.out.println();

        upSideDown(8,6);
    }
}

/*
OUTPUT

 666666
  4444
   22

1
21
123
4321
12345
654321

    1
   121
  12321
 1234321
123454321

987656789
 8765678
  76567
   656
    5

87678
 767
  6

 */
