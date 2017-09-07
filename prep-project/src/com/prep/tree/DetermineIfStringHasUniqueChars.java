package com.prep.tree;

import java.util.Arrays;

/*
 * Approach 2 – Sorting: Using sorting based on ASCII values of characters
Time Complexity: O(n log n)
 */
public class DetermineIfStringHasUniqueChars {

	public static boolean findIfUnique(char[] a){
		Arrays.sort(a);
		boolean b = false;
		for(int i=0;i<a.length;i++){
			if(i+1<a.length){
			if(a[i]==a[i+1]){
				b = false;
				break;
			}
			else {
				b = true;
			}
			}
			
		}
		return b;
	}	
	public static void main(String[] args){
		String s = "hello";
		char[] c = s.toCharArray();
		boolean b = DetermineIfStringHasUniqueChars.findIfUnique(c);
		System.out.println(b);
	}
}
