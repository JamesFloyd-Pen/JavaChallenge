package com.paimon.Practice;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        swapElements(arr, 0, 1);
    }

    private static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for(int a: arr){
            System.out.println(a);
        }
    }

}
