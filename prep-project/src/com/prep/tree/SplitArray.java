package com.prep.tree;

public class SplitArray {
	
	public static boolean splitArr(int[] nums) {
		  int index = 0;
		  int sum1 = 0;
		  int sum2 = 0;
		  return recArray(nums, index, sum1, sum2);
		}
		private static boolean recArray ( int[] nums, int index, int sum1, int sum2 ) {
		  if ( index >= nums.length ) {
		    return sum1 == sum2;
		  }
		  int value = nums[index];
		  return (recArray(nums, index + 1, sum1 + value, sum2) || recArray(nums, index + 1, sum1, sum2 + value));
		}

		public static void main(String[] args){
			int[] arr = {1,2,3};
			boolean b = splitArr(arr);
			System.out.println(b);
			int[] a = {1,2,0};
			boolean c = splitArr(a);
			System.out.println(c);
			int[] d = {1,2,3,5,1};
			boolean e = splitArr(d);
			System.out.println(e);
		}
}
