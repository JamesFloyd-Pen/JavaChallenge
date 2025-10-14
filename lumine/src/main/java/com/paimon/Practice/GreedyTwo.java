package com.paimon.Practice;

import java.util.Arrays;

public class GreedyTwo {

    public static void main(String[] args) {
        int[] coins = {5, 2, 10, 1};
        int amount = 39; // Amount to make change for
        
        System.out.println(minCoins(coins, amount));

    }

    // Coins being 10, 5, 2, 1

    static int minCoins(int[] coins, int amount) {
        int n = coins.length;
        Arrays.sort(coins);  
        int res = 0;
        
        // Start from the coin with highest denomination
        for (int i = n - 1; i >= 0; i--) {
            if (amount >= coins[i]) {
              
                // Find the maximum number of ith coin we can use
                int cnt = (amount / coins[i]);
                System.out.println(cnt + " coins of " + coins[i]);
                
                // Add the count to result
                res += cnt;
                
                // Subtract the corresponding amount from 
                // the total amount
                amount -= (cnt * coins[i]);
            }
            
            // Break if there is no amount left
            if (amount == 0)
                break;
        }
        return res;
    }
    
}
