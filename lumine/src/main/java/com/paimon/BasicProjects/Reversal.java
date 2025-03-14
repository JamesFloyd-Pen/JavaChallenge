package com.paimon.BasicProjects;

public class Reversal {

    public static void main(String[] args) {
        
        int[] arr = {3, 2, 1};
        reverse(arr, 0, arr.length - 1);
        for(int n : arr){
            System.out.println(n);
        }
        
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
