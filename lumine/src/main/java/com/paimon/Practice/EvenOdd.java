package com.paimon.Practice;

public class EvenOdd {
    //prints out all the evens from lowest to highest on the left side
    //prints out all the odds from highest to lowest on the right side.


    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4, 3, 6, 5, 8};
        int[] numsNormal = {0,1,2,3,4,5,6,7,8,9};
        sortMe(nums);
    }

     private static void sortMe(int[] nums) {
        // TODO Auto-generated method stub
        int[] newArr = new int[nums.length];
        int left = 0, right = nums.length -1;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] % 2 == 0){
                newArr[left++] = nums[i];
            }else{
                newArr[right--] = nums[i];
            }
        }

        for(int n : newArr){
            System.out.print(n + " ");
        }
     }
    
}
