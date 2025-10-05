package com.paimon.Practice;

import java.util.HashMap;

public class Roman {
    public static void main(String[] args) {
        Roman roman = new Roman();
        System.out.println(roman.romanToInt("MCMXCIV"));
    }


     public int romanToInt(String s) {
        HashMap<Character, Integer> index = new HashMap<>();
        char[] romanLetter = s.toCharArray();
        int sum = 0;
        int preValue = 0;

        index.put('I', 1);
        index.put('V', 5);
        index.put('X', 10);
        index.put('L', 50);
        index.put('C', 100);
        index.put('D', 500);
        index.put('M', 1000);


        for(int i = romanLetter.length -1; i >= 0; i--){
            int curValue = index.get(romanLetter[i]);
            if(curValue < preValue){
                sum -= curValue;
            }else{
                sum += curValue;
            }

            preValue = curValue;

        }
        
        return sum;
    }

}
