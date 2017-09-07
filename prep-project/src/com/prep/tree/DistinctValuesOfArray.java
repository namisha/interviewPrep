package com.prep.tree;

import java.util.HashSet;

public class DistinctValuesOfArray {

	public int[] returnDistinctArray(int[] distinctArr){

		int distinctValue[];
		HashSet<Integer> distinct = new HashSet<Integer>();

		if(distinctArr.length==0 || distinctArr.length==1){
			distinctValue = new int[0];
			return distinctValue;
		}

		for(int element : distinctArr){
			if(!distinct.contains(element)){
				distinct.add(element);
			}
		}
		
		if(distinctArr.length == distinct.size()){
			distinctValue = new int[0];
			return distinctValue;
		}
		distinctValue = new int[distinct.size()];
		int iterator = 0;
		for(int each : distinct){
			distinctValue[iterator] = each;
			iterator++;
		}
		
		return distinctValue;
	}
	
	public static void main(String args[]){
		DistinctValuesOfArray d = new DistinctValuesOfArray();
		int[] arr1 = {1,2,5,6,7};
		int[] arr2 = {1,2,5,6,2};
		int[] arr3 = {1};
		int[] arr4 = null;
		int[] arr5;
		int[] arr6 = {0,1,-1};
		
		System.out.println("arr1 : " + d.returnDistinctArray(arr1));
		System.out.println("arr2 : " + d.returnDistinctArray(arr2));
		System.out.println("arr3 : " + d.returnDistinctArray(arr3));
//		System.out.println("arr4 : " + d.returnDistinctArray(arr4)); ///throws null pointer exception at (DistinctValuesOfArray.java:12)
//		System.out.println("arr5 : " + d.returnDistinctArray(arr5)); // throws error that we need to initalize variable.
		System.out.println("arr6 : " + d.returnDistinctArray(arr6));
	}
}
