package com.paimon.lumine;

public class PracticeNewYear {
    public static void main(String[] args) {
        int aim = 9;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = binarySearch(arr, aim);
        if (result[0] != -1) {
            System.out.println("Your target is at index: " + result[0] + " and it took " + result[1] + " steps to find it.");
        } else {
            System.out.println("Target not found in the array. It took " + result[1] + " steps.");
        }
    }

    public static int[] binarySearch(int[] input, int target) {
        int steps = 0;
        int left = 0;
        int right = input.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            steps++;

            if (input[middle] == target) {
                return new int[]{middle, steps};
            }
            if (input[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return new int[]{-1, steps}; // Target not found
    }
}