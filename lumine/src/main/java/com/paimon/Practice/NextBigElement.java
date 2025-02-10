package com.paimon.Practice;

public class NextBigElement {

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] output = nextGreaterElement(nums1, nums2);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    int k = j + 1;
                    while (k < nums2.length && nums2[k] <= nums2[j]) {
                        k++;
                    }
                    if (k < nums2.length) {
                        output[i] = nums2[k];
                    } else {
                        output[i] = -1;
                    }
                    break;
                }
                j++;
            }
        }
        return output;
    }

    
}
