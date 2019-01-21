package com.sp.easyCollection;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoveDuplicatesfromSortedArray {
    private static final Logger logger= Logger.getLogger(RemoveDuplicatesfromSortedArray.class.getName());

    public int removeDuplicates(int[] nums) {
        //Base Case
        if(nums.length == 0)
            return 0;

        //Two pointer one to keep track of previousNumber and other for newIndex and return currentIndex+1.
        int previousNumber=nums[0],newIndex=1;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]!=previousNumber){
                nums[newIndex]=nums[i];
                previousNumber=nums[i];
                newIndex++;
            }
        }
        return  newIndex;
    }

    public String printArray(int[] arr){
        return printArray(arr,arr.length);
    }

    public String printArray(int[] arr,int length){
        StringBuilder str=new StringBuilder("Array : ");

        for (int i = 0; i <length ; i++) {
            str.append(arr[i]);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String methodName="Remove Duplicates";
        logger.log(Level.INFO,methodName+":Starts");
        RemoveDuplicatesfromSortedArray obj=new RemoveDuplicatesfromSortedArray();
        int [] arr1={};
        int [] arr2={1,1,2};
        int [] arr3={0,0,1,1,1,2,2,3,3,4};
        logger.log(Level.INFO,"Before Removing Duplicates");
        logger.log(Level.INFO,obj.printArray(arr1));
        logger.log(Level.INFO,obj.printArray(arr2));
        logger.log(Level.INFO,obj.printArray(arr3));
        logger.log(Level.INFO,"After Removing Duplicates");
        logger.log(Level.INFO,obj.printArray(arr1,obj.removeDuplicates(arr1)));
        logger.log(Level.INFO,obj.printArray(arr2,obj.removeDuplicates(arr2)));
        logger.log(Level.INFO,obj.printArray(arr3,obj.removeDuplicates(arr3)));
        logger.log(Level.INFO,methodName+":Ends");
    }
}
