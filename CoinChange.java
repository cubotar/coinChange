package org.mkoutar;

import org.junit.Test;

import java.util.Arrays;

public class CoinChange {


    @Test
    public void changeCoin() {

        int[] coins = { 2,5,10};
        int amount = 13;

        int[] solutions = new int[amount+1];
        Arrays.fill(solutions, amount);
        solutions[0] = 0;
        for (int i = 0; i < solutions.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                checkSolution(solutions , i , coins[j]);
            }
        }
        if(solutions[solutions.length-1] != amount)
            System.out.println(solutions[solutions.length-1]);
        else
            System.out.println("No Solution");


    }

    private void checkSolution(int[] solutions, int i, int coin) {
        if(i < coin) return;
        solutions[i] = Math.min(solutions[i], 1+ solutions[i-coin]);
    }


}
