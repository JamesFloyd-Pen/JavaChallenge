package com.paimon.lumine;

public class PNYTwoPointerSearch {
    public static void main(String[] args) {
        int aim = 5;

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The target is at index: " + twoPointerSearch(arr, aim));
    }
    

    private static int twoPointerSearch(int[] input, int target) {
        int left = 0;
        int right = input.length - 1;

        while (left <= right) {
            if (input[left] + input[right] == target) {
                return left;
            } else if (input[left] + input[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return -1; // Target not found
    }
}
