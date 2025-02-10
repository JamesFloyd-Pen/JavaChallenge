package com.paimon.Practice;

import java.util.HashSet;


public class FindCandy {

    public static void main(String[] args) {
        int[] candies = {2, 3, 1, 3};
        System.out.println(distributeCandies(candies));

    }

    public static int distributeCandies(int[] candyType) {
        int doctorRecommendation = (candyType.length / 2);
        HashSet<Integer> candyMap = new HashSet<>();

        //ADD array elements to the Hash SEt
        for(int i : candyType){
            candyMap.add(i);
        }
        //Check if the size of the Hash Set is greater than or equal to the doctor's recommendation
        if(candyMap.size() >= doctorRecommendation){
            return doctorRecommendation;

        }else{
            return candyMap.size();
        }
        
    }
    
}
