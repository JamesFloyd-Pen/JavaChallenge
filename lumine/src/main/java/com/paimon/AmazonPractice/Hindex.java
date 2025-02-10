package com.paimon.AmazonPractice;

import java.util.Arrays;

public class Hindex {
    public static void main(String[] args) {
        int[] citations = {6, 5, 3, 1, 0};
        int hIndex = calculateHIndex(citations);
        System.out.println("H-index: " + hIndex);
    }

    public static int calculateHIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}