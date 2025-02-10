package com.paimon.lumine;

public class buzzFuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("BuzzFuzz");
            } else if(i % 3 == 0){
                System.out.println("Buzz");
            } else if(i % 5 == 0){
                System.out.println("Fuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
