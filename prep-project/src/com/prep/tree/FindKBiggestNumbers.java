package com.prep.tree;

import java.util.ArrayList;
import java.util.List;

public class FindKBiggestNumbers {
	
	public int[] bubbleSort(int[] a){
		int p;
		int m = a.length;
		for(int n=m; n>0;n--){
			for(int i=0;i<m-1;i++){
				p = i+1;
				if(a[i]<a[p]){
					int temp = a[i];
					a[i] = a[p];
					a[p] = temp;
				}
			}
		}
		return a;
	}
	public List<Integer> biggestKNumbers(int[] nums, int k){
		List<Integer> ret = new ArrayList<Integer>();
		int[] a = bubbleSort(nums);
		for (int j=0;j<k;j++){
			ret.add(a[j]);
		}
		System.out.println(ret.toString());
		return ret;
	}
	
	public Integer KthLargest(int[] nums, int k){

		int[] a = bubbleSort(nums);
		int maxkth = 0;
		if(k<=a.length){
			maxkth = a[k-1];
		}
		System.out.println(String.valueOf(maxkth));
		return maxkth;
	}
	public static void main(String args[]){
		FindKBiggestNumbers f = new FindKBiggestNumbers();
		int[] nums = {1,4,6,7,8,2};
		f.biggestKNumbers(nums, 3);
		f.KthLargest(nums, 3);
	}

}
