package com.sp.easyCollection;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int duplicateNumber=0;
        for (int i:nums) {
            duplicateNumber=duplicateNumber^i;
        }
        return duplicateNumber;
    }

    public static void main(String[] args) {
        int[] nums={2,2,1};
        int[] nums2={4,1,2,1,2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums2));
    }
}
