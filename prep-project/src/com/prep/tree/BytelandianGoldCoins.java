package com.prep.tree;

public class BytelandianGoldCoins {

	// Returns the number of arrangements to 
	// form 'n' 
	public static int solve(int n)
	{ 
	   // base case
	   if (n <= 0) 
	      return 0;
	   
	   return Math.max(n,(n/2+n/3+n/4));
	} 
	
	 public static void main(String[] args)
	    {
		 System.out.println(solve(16));
	    }
}
