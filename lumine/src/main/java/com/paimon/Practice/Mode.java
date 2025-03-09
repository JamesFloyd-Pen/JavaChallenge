package com.paimon.Practice;

public class Mode {
    public static void main(String[] args) {
        Mode modes = new Mode();
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {2, 2, 3, 5, 5, 3,3 };
        modes.mode(arr);
    }

    public void mean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The mean is: " + (double) sum / arr.length);
    }
    
    public void median(int[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            System.out.println("The median is: " + arr[n / 2]);
        } else {
            System.out.println("The median is: " + (arr[(n - 1) / 2] + arr[n / 2]) / 2.0);
        }
    }

    public void mode(int[] arr) {
        int maxValue = 0, maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        System.out.println("The mode is: " + maxValue);
    }

}
