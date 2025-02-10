package com.paimon.AmazonPractice;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 3;
        int result = solution.minSubArrayLen(target, nums);
        System.out.println("Minimum size subarray sum: " + result);
    }
}