package com.paimon.Practice;

public class Candy {
    // Class implementation goes here

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        // Calculate prefix products
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
            System.out.println("Prefix: " + ans[i]);
        }

        int prevSuffix = 1;
        // Calculate suffix products and update ans array
        for (int i = n - 2; i >= 0; i--) {
            prevSuffix *= nums[i + 1];
            ans[i] *= prevSuffix;
            System.out.println("Suffix: " + ans[i]);

        }

        /* 
        for(int i = n - 2; i >= 0; i--) {
            System.out.println("Rating: " + ratings[i]);
        }
        */

    }
}