package com.paimon.lumine;

import java.util.Arrays;

public class helloWorldTest {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j *= 2) {
                System.out.println("Hello World");
                count++;
            }
        }

        //This loop prints out "hello world" in the nested loop 5 times. With the outer loop, it goes through 10 times.
        //Thus it prints out 40 times.

        System.out.println("We printed out: " + count);

        System.out.println(median(numbers));
    }


    public static double median(int[] numbers) {
        int n = numbers.length;
        Arrays.sort(numbers);
        if (n % 2 == 0) {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            return numbers[n / 2];
        }
    }
}
