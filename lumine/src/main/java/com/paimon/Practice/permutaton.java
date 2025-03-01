package com.paimon.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permutaton {

    public static void main(String[] args) {
        String str = "XYZ";
        List<String> result = findPermutation(str);
        for(String s : result){
            System.out.println(s);
        }
    }
    static void recurPermute(int index, StringBuilder s, 
                            List<String> ans) {

        // Base Case
        if (index == s.length()) {
            ans.add(s.toString());
            return;
        }

        // Swap the current index with all
        // possible indices and recur
        for (int i = index; i < s.length(); i++) {
            swap(s, index, i);
            recurPermute(index + 1, s, ans);
            swap(s, index, i);
        }
    }

    // Swap characters at positions i and j
    static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    // Function to find all unique permutations
    static List<String> findPermutation(String s) {

        // Stores the final answer
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);

        recurPermute(0, str, ans);

        // sort the resultant list
        Collections.sort(ans);

        return ans;
    }

}
