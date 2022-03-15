package com.company.Conditionals.Conditionials.java;

import org.w3c.dom.ls.LSOutput;

public class DualSpinner {
    /** Precondition: min < max
     */
    /*The spin method simulates a spin of a fair spinner.
     * The method returns a random integer between min and max,
     * inclusive. Complete the spin method below by assigning
     * this random integer to result.
     */
    public int spin(int min, int max)
    {
        int result = (int)((max - min + 1) * Math.random() + min);

        return result;
    }

    /** Simulates one round of the game as described in part (b).
     */
    public void playRound()
    {
        int player = spin (1,10);
        int robot = spin (2,8);

        if (player > robot) {
            System.out.println("You win! " + (player - robot) + " points.");
        }
        else if (player < robot) {
            System.out.println("You lose! -" + (robot - player) + " points.");
        }
        else //First Tie Case
        {
            player = player + spin (1,10);
            robot = robot + spin (2,8);

            if (player > robot)
            {
                System.out.println("You Win! 1 point");
            }
            else if (player < robot)
            {
                System.out.println("You Lose! -1 point");
            }
            else // Second Tie case
            {
                System.out.println("Tie! 0 points.");
            }
        }
    }
    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for(int i = 0; i < 10; i++){
            ds.playRound();
        }
    }
}

/*
Output Test 1:
You win! 5 points.
You Win! 1 point
You lose! -4 points.
You Lose! -1 point
You lose! -3 points.
You win! 2 points.
You Win! 1 point
You win! 2 points.
You lose! -3 points.
You win! 1 points.
 */