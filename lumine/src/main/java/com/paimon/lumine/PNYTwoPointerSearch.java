package com.paimon.lumine;

public class PNYTwoPointerSearch {
    public static void main(String[] args) {
        int aim = 10; // Changed to 10 for a valid sum in the array

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = twoPointerSearch(arr, aim);
        
        if (result[0] != -1) {
            System.out.println("Found pair at indices: " + result[0] + " and " + result[1]);
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + aim);
        } else {
            System.out.println("Target sum not found");
        }
    }
    
    private static int[] twoPointerSearch(int[] input, int target) {
        int left = 0;
        int right = input.length - 1;

        while (left < right) { // Changed <= to < to avoid using same element twice
            int sum = input[left] + input[right];
            
            if (sum == target) {
                return new int[]{left, right}; // Return both indices
            } else if (sum < target) {
                left++;
                System.out.println("Moving left pointer to index: " + left);
            } else {
                right--;
                System.out.println("Moving right pointer to index: " + right);
            }
        }
        return new int[]{-1, -1}; // Target not found
    }
}