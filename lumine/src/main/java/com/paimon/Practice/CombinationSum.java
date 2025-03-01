package com.paimon.Practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Find all unique combinations.
        //Can be required in any order
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        if(candidates.length == 0 || candidates.length == 1){
            return output;
        }

        makeCombination(candidates, target, 0, output,0, current);
        

        return output;
    }

    private static void makeCombination(int[] candidates, int target, int index, List<List<Integer>> output, int total, List<Integer> current){
        if(total == target){
            output.add(new ArrayList<>(current));
            return;
        }

        if(total > target || index >= candidates.length){
            return;
        }

        current.add(candidates[index]);
        makeCombination(candidates, target, index, output, total + candidates[index] , current);
        current.remove(current.size() -1);
        makeCombination(candidates, target, index +1, output, total, current);

        System.out.println("Current: " + current);
        System.out.println("Output: " + output);
        System.out.println("Total: " + total);

    }

    
}
