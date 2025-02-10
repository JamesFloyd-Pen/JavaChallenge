package com.paimon.lumine;

public class AmazonPracticeProblems {
    public static void main(String[] args) {
        int[] arr = {1, 24, 51, 10, 42, 15, 3, 2, 11, 7, 29};

        int[] newArr = findThreeLargestNumbers(arr);

        for (int i : newArr) {
            System.out.println(i);
        }
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int num : array) {
            updateLargest(threeLargest, num);
        }

        return threeLargest;
    }

    private static void updateLargest(int[] threeLargest, int num) {
        if (num > threeLargest[2]) {
            shiftAndUpdate(threeLargest, num, 2);
        } else if (num > threeLargest[1]) {
            shiftAndUpdate(threeLargest, num, 1);
        } else if (num > threeLargest[0]) {
            shiftAndUpdate(threeLargest, num, 0);
        }
    }

    private static void shiftAndUpdate(int[] array, int num, int idx) {
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                array[i] = num;
            } else {
                array[i] = array[i + 1];
            }
        }
    }
}
