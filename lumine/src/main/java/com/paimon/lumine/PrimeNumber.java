package com.paimon.lumine;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 5;

        if (TRPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static boolean TRPrime(int num){
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
                
            }
        }

        return true;

    }
}
