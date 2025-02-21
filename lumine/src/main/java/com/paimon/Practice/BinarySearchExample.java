package com.paimon.Practice;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] arr = {1,3, 5, 6, 8, 9};
        int target = 5;
        int result = search(arr, target);
                System.out.println("The target is at index: " + result);
            }
        
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        int count = 0;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            System.out.println("count: " + count);
            System.out.println("The mid is: " + mid);

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                right--;
            }else{
                left++;
            }
            count++;
        }

        return -1;
    }
    
}
