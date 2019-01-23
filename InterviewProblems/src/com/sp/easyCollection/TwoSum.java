package com.sp.EasyCollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
            }else
                map.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res={2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(res,18)));
    }
}
