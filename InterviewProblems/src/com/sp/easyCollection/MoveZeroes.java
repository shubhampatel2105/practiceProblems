package com.sp.easyCollection;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int newIndex=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[newIndex]=nums[i];
                newIndex++;
            }
        }
        while (newIndex<nums.length) {
            nums[newIndex] = 0;
            newIndex++;
        }
    }
    public static void main(String[] args) {
        int[] num1={0,1,0,3,12};
        moveZeroes(num1);
    }
}
