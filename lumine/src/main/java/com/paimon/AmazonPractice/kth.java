package com.paimon.AmazonPractice;

import java.util.ArrayList;

public class kth {
    public static void main(String[] args) {
        int n = 12;
        int k = 3;
        System.out.println(kthFactor(n, k));
    }

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> factors = new ArrayList<>();
        int x = 1;
        while(x<=n){
            if(n % x == 0){
                factors.add(x);
            }
            x++;
        }
        if(factors.size() < k){
            return -1;
        }
        return factors.get(k-1);
    }

        // n % i == 0
        // numbers that can equal to 12

        //make a list to mark down all possible factors
        //do a search for K to see if a faction goes to K


    public static int kthFactor2(int n, int k) {
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                k--;
            }

            if(k == 0){
                return i;
            }
        }

        return -1;
    }
    
}
