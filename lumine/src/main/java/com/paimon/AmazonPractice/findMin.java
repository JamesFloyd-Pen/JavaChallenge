package com.paimon.AmazonPractice;

import java.util.Arrays;

public class findMin {
    public static void main(String[] args) {
        int[] nums = {5, 2, 4, 7, 10};
        System.out.println(findMinFun(nums));
        System.out.println(findMinUsingStreams(nums));
    }
    

    private static int findMinFun(int[] nums) {
        int myMin = nums[0];
        for(int i = 0; i <nums.length; i++){
            myMin = Math.min(myMin, nums[i]);
        }

        return myMin;
    }

    //Don't use this for Interviews Note lol
    private static int findMinUsingStreams(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }
}
