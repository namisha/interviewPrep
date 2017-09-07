package com.prep.tree;

import java.util.Arrays;

public class MedianOfTwoLargeArrays {

	public static int countWhileMerging(int[] a, int[] b, int n){ //Time Complexity: O(n)
		int m1 = -1;
		int m2 = -1;
		int i = 0,j=0;
		int count;
		for(count=0;count<n;count++){
			if(i==n){ //when all of a is less than first element of b
				m1 = m2;
	            m2 = b[0];
	            break;
			}
			if(j==n){//when all b is less than first element of a
				m1 = m2;
	            m2 = a[0];
	            break;
			}
			if(a[i]<b[j]){
				m1 = m2;  /* Store the prev median */
	            m2 = a[i];
	            i++;
			}
			else {
				m1 = m2;  /* Store the prev median */
	            m2 = b[i];
	            j++;
			}
		}
		return (m1 + m2)/2;
	}
	
	public static void main(String[] args)
	{
	    int ar1[] = {1, 12, 15, 26, 38};
	    int ar2[] = {2, 13, 17, 30, 45};
	 
	    int n1 = ar1.length;
	    int n2 = ar2.length;
	    if (n1 == n2)
	        System.out.println(countWhileMerging(ar1, ar2, n1));
	    else
	    	System.out.println("Doesn't work for arrays of unequal size");
	  
	}
}
	
	//refer geeks for geeks for more methods.
