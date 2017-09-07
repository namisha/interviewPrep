package com.prep.tree;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumsArray {
	    public int[] twoSum(int[] nums, int target) {
	       int[] arr = new int[2];
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                   arr[0] = i;
	                   arr[1] = j;
	               //    break; //there is one or more similar element   int[] nums = {2, 7, 7, 15};
	                }
	            }
	        }
	        return arr;
	    }
	    public static void main(String args[]){
	    	SumOfNumsArray s = new SumOfNumsArray();
	        int[] nums = {2, 7, 12, 15};
	       int[] i =  s.twoSum(nums,9);
	       System.out.println(i);
	    }
}
