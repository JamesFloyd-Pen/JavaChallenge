package com.paimon.AmazonPractice;

public class BubbleSortHighToLow {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] < arr[j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
