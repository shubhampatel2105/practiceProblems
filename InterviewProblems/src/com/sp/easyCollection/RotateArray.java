package com.sp.easyCollection;

import java.util.Arrays;

public class RotateArray {
    private static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotate(int[] nums, int order) {
        int len = nums.length;
        if (len == 0 || nums == null || order < 0)
            return;

        if (order > len)
            order = order % len;

        int firstPartLength = len - order;

        reverse(nums, 0, firstPartLength-1);
        reverse(nums, firstPartLength, len - 1);
        reverse(nums, 0, len - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {-1, -100, 3, 99};
        rotate(nums, 3);
        rotate(nums2, 2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }
}
