package com.paimon.Practice;

import java.util.ArrayList;
import java.util.List;

public class GreedyOne {
    
    public static void main(String[] args) {
        int[] coins = {25, 10, 5, 1}; // US coin denominations (quarters, dimes, nickels, pennies)
        int amount = 67; // Amount to make change for
        
        List<Integer> result = makeChange(coins, amount);
        
        System.out.println("Making change for $" + (amount / 100.0));
        System.out.println("Coins used: " + result);
        System.out.println("Total coins: " + result.size());
        
        // Count each denomination
        countCoins(result);
    }
    
    /**
     * Greedy algorithm to make change using the minimum number of coins
     * @param coins Array of coin denominations (sorted in descending order)
     * @param amount Amount to make change for
     * @return List of coins used
     */
    public static List<Integer> makeChange(int[] coins, int amount) {
        List<Integer> result = new ArrayList<>();
        
        // Greedy approach: use the largest coin possible at each step
        for (int coin : coins) {
            while (amount >= coin) {
                result.add(coin);
                amount -= coin;
            }
        }
        
        return result;
    }
    
    /**
     * Helper method to count and display each coin denomination
     */
    public static void countCoins(List<Integer> coins) {
        int quarters = 0, dimes = 0, nickels = 0, pennies = 0;
        
        for (int coin : coins) {
            switch (coin) {
                case 25: quarters++; break;
                case 10: dimes++; break;
                case 5: nickels++; break;
                case 1: pennies++; break;
            }
        }
        
        System.out.println("\nBreakdown:");
        if (quarters > 0) System.out.println("Quarters (25¢): " + quarters);
        if (dimes > 0) System.out.println("Dimes (10¢): " + dimes);
        if (nickels > 0) System.out.println("Nickels (5¢): " + nickels);
        if (pennies > 0) System.out.println("Pennies (1¢): " + pennies);
    }
    
    /**
     * Alternative greedy algorithm: Activity Selection Problem
     * Selects maximum number of non-overlapping activities
     */
    public static class ActivitySelection {
        static class Activity {
            int start, finish;
            String name;
            
            Activity(String name, int start, int finish) {
                this.name = name;
                this.start = start;
                this.finish = finish;
            }
            
            @Override
            public String toString() {
                return name + "(" + start + "-" + finish + ")";
            }
        }
        
        public static List<Activity> selectActivities(Activity[] activities) {
            List<Activity> selected = new ArrayList<>();
            
            // Sort by finish time (greedy choice)
            java.util.Arrays.sort(activities, (a, b) -> a.finish - b.finish);
            
            // Select first activity
            selected.add(activities[0]);
            int lastFinishTime = activities[0].finish;
            
            // Greedy selection: pick activities that start after the last selected activity finishes
            for (int i = 1; i < activities.length; i++) {
                if (activities[i].start >= lastFinishTime) {
                    selected.add(activities[i]);
                    lastFinishTime = activities[i].finish;
                }
            }
            
            return selected;
        }
        
        public static void demonstrateActivitySelection() {
            Activity[] activities = {
                new Activity("A1", 1, 4),
                new Activity("A2", 3, 5),
                new Activity("A3", 0, 6),
                new Activity("A4", 5, 7),
                new Activity("A5", 8, 9),
                new Activity("A6", 5, 9)
            };
            
            System.out.println("\n=== Activity Selection Problem ===");
            System.out.println("Available activities:");
            for (Activity a : activities) {
                System.out.println(a);
            }
            
            List<Activity> selected = selectActivities(activities);
            System.out.println("\nSelected activities (maximum non-overlapping): " + selected);
        }
    }
}