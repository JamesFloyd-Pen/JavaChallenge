package com.Datastructures;

public class TestRecursion {

    public static void main(String[] args) {
        int testNumberX = 5;
        minusN(testNumberX);
        System.out.println();
        plusN(1, testNumberX);
    }

    public static int minusN(int n){
        if( n > 0 ){
            System.out.print(n + " ");
            minusN(n-1);
        }
        return n;
    }

    public static int plusN(int current, int max){
        if(current <= max){
            System.out.print(current + " ");
            plusN(current + 1, max);
        }
        return current;
    }
}
