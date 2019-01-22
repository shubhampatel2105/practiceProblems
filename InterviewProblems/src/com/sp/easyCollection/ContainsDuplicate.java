package com.sp.easyCollection;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length < 2 ||nums == null)
            return false;
        HashSet<Integer> set=new HashSet<>();
        for (int i:nums){
            if(!set.add(i))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int[] nums2={1,2,3,4};
        int[] nums3={1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}
