package com.paimon.AmazonPractice;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generatePascalTriangle(numRows);
        printPascalTriangle(triangle);
    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            // First element of each row is always 1
            row.add(1);

            // Each element is the sum of the two elements directly above it
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of each row is always 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void printPascalTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}