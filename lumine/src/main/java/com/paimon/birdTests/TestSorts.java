package com.paimon.birdTests;

public class TestSorts {


    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1, 4};
        arr = doSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
        
    }

    public static int[] doSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }


    
}
