package com.paimon.Practice;

public class MaxElement {

    //1. Find the Maximum Element in an Array
    //Problem: Write a function to find the maximum element in an array.


    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1, 4};
        int max = findMax(arr);
        System.out.println("Maximum element: " + max);

        
    }

    public static int findMax(int[] arr){
        int maximumPULSE = arr[0];
        for(int i = 1; i < arr.length; i++){
            maximumPULSE = Math.max(maximumPULSE, arr[i]);
        }
        return maximumPULSE;

    }
    
}
