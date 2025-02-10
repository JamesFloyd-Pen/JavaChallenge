package com.paimon.AmazonPractice;

public class missingNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,2};
        //System.out.println(missingNumber(nums));
        System.out.println(middleArray(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for(int i = 0; i < n; i++){
            sum -= nums[i];
        }
        return sum;
    }

    public static int middleArray(int[] nums){
        int n = nums.length;
        int sum = n  / 2;

        return sum;
    }
    
}
