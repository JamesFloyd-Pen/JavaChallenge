package com.paimon.Practice;

public class MathTest {

    public static void main(String[] args) {
        MathTest.fizzBuzz();
    }
    
    public static void fizzBuzz(){
        for(int i = 1; i < 15; i++){
            if(i % 3 == 0 || i % 15 == 0) System.out.println("FizzBuzz"); 
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0 )System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    //
}
