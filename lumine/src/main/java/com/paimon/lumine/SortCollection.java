package com.paimon.lumine;

import java.util.Arrays;

public class SortCollection {

    // Bubble Sort
    // Best case: O(n) - when the array is already sorted
    // Worst case: O(n^2) - when the array is sorted in reverse order
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    // Best case: O(n^2) - no matter what, it always performs n^2 comparisons
    // Worst case: O(n^2) - same as best case
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap arr[i] and arr[minIdx]
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    // Best case: O(n) - when the array is already sorted
    // Worst case: O(n^2) - when the array is sorted in reverse order
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Merge Sort
    // Best case: O(n log n) - always divides the array into halves
    // Worst case: O(n log n) - same as best case
    public void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            // Split the array into two halves
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            // Recursively sort each half
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(arr, left, right);
        }
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Quick Sort
    // Best case: O(n log n) - when the pivot divides the array into two equal halves
    // Worst case: O(n^2) - when the pivot is the smallest or largest element
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        SortCollection sorter = new SortCollection();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(arr));

        sorter.bubbleSort(arr);
        System.out.println("Sorted array with Bubble Sort: " + Arrays.toString(arr));

        arr = new int[]{64, 34, 25, 12, 22, 11, 90};
        sorter.selectionSort(arr);
        System.out.println("Sorted array with Selection Sort: " + Arrays.toString(arr));

        arr = new int[]{64, 34, 25, 12, 22, 11, 90};
        sorter.insertionSort(arr);
        System.out.println("Sorted array with Insertion Sort: " + Arrays.toString(arr));

        arr = new int[]{64, 34, 25, 12, 22, 11, 90};
        sorter.mergeSort(arr);
        System.out.println("Sorted array with Merge Sort: " + Arrays.toString(arr));

        arr = new int[]{64, 34, 25, 12, 22, 11, 90};
        sorter.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array with Quick Sort: " + Arrays.toString(arr));
    }
}