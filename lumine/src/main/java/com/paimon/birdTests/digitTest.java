package com.paimon.birdTests;

public class digitTest {
    public static void main(String[] args) {
        int num = 38;
        int result = addDigits(num);
        System.out.println("The result of repeatedly adding digits until one digit is: " + result);
    }

    public static int addDigits(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}