package com.paimon.Practice;

public class checkFunctions {

    public static void main(String[] args) {
        char example1 = 'A';

        System.out.println(Character.isUpperCase(example1));
        System.out.println((int)example1);
        System.out.println((char)65);
    }

    // 709. To Lower Case. LeetCode Problem. Using ASCII.

    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                int ascii =(int) arr[i];
                ascii += 32;
                char temp = (char) ascii;
                sb.append(temp);
            }else{
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
    
}
