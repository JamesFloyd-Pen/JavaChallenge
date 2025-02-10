package com.paimon.birdTests;

import java.util.Arrays;

public class BoardTest {
    public static void main(String[] args) {
        String input = "ABCDEFGHIJKLMN";
        char[][] result = createPatternArray(input, 3, 3);

        // Print the 2D array
        for (char[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static char[][] createPatternArray(String input, int rows, int cols) {
        char[][] array = new char[rows][cols];
        for (char[] row : array) {
            Arrays.fill(row, ' '); // Initialize with space or any other default value
        }

        int index = 0;
        int r = 0, c = 0;
        boolean goingDown = true;

        while (index < input.length() && r < rows && c < cols) {
            array[r][c] = input.charAt(index++);
            if (goingDown) {
                if (r + 1 < rows) {
                    r++;
                } else {
                    goingDown = false;
                    r--;
                    c++;
                }
            } else {
                if (r - 1 >= 0 && c + 1 < cols) {
                    r--;
                    c++;
                } else {
                    goingDown = true;
                    r++;
                }
            }
        }

        return array;
    }
}