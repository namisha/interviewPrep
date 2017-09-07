package com.prep.tree;

public class FindSecondLargestElementInArray {

	public static void findSecondLargetsNum(int[] a){

		int max=Integer.MIN_VALUE, secondMax=Integer.MIN_VALUE;
		for(int i: a)
		{
			if(i>max)
			{
				secondMax=max;
				max=i;

			}
			else if (i<max && i>secondMax)
			{
				secondMax=i;
			}
		}
		System.out.println(secondMax);	
	}

	public static int greatestNegative(int[] list) {
		int max = Integer.MIN_VALUE;
		boolean set = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i] < 0 && list[i] > max) {
				max = list[i];
				set = true;
			}
		}
		if (!set)
			max = 0;
		System.out.println(max);
		return max;
	}

	public static void main(String[] args){
		int[] arr = {-1,-145,-90,-184,-90,-10};
		findSecondLargetsNum(arr);
		int[] ar = {-1,145,90,184,-90,10};
		findSecondLargetsNum(ar);
		int[] b = {-1,0,-90,-184,-90,10};
		findSecondLargetsNum(b);
		int[] c = {0};
		findSecondLargetsNum(c);
		int[] d = {0,1,2};
		findSecondLargetsNum(d);
		int[] e = {};
		findSecondLargetsNum(e);
	}
}
