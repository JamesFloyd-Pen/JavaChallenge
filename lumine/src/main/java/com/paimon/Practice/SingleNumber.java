package com.paimon.Practice;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        //System.out.println(missingNumber(nums));
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
            
            int result = 0;
            
            for(int i = 0; i < nums.length; i++){
                result = result ^ nums[i];
                System.out.println(result);
            }
            
            return result;
            
            
    }
    
    
}
