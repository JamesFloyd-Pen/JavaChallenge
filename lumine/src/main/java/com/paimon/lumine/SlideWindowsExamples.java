package com.paimon.lumine;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlideWindowsExamples {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7, 8,  9};
        int k = 4;

        nums = slidingWindowMax(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }



        
    }
    public static int[] slidingWindowMax(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            // remove numbers out of range k
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            // add new number at the end of deque
            deque.offer(i);
            // the first number in deque is the largest number of previous window, so add to result
            if (i >= k - 1) {
                result[ri++] = nums[deque.peek()];
            }
        }
        return result;
    }
}
