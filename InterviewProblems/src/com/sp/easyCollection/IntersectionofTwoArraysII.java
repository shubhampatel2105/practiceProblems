package com.sp.easyCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersectArray = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums2[j] < nums1[i])
                j++;
            else {
                intersectArray.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[intersectArray.size()];
        for (int a = 0; a < result.length; a++) {
            result[a] = intersectArray.get(a);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] res = intersect(arr1, arr2);
        for (int x : res) {
            System.out.println(x);
        }
    }
}
