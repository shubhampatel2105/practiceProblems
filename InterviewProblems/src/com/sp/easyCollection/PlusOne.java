package com.sp.easyCollection;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        boolean shouldAdd=false;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] == 9){
                shouldAdd=true;
                digits[i]=0;
            }else {
                digits[i]+=1;
                shouldAdd=false;
            }
            if(!shouldAdd)
                break;
        }
        if (shouldAdd) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] num1={1,2,3};
        int[] num2={9,9,9};
        int[] num3={8,9,9};
        System.out.println(Arrays.toString(plusOne(num1)));
        System.out.println(Arrays.toString(plusOne(num2)));
        System.out.println(Arrays.toString(plusOne(num3)));
    }

}
