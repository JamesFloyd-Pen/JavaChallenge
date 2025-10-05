package com.paimon.lumine;

public class Retraining { 
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        System.out.println(n.length);
        if(java.util.Arrays.stream(n).anyMatch(x -> x == 6)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }   

}
