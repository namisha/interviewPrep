package com.prep.tree;

public class SumOfTwoNumsWithoutUsingPlus {

	/*
	 * Write code to sum 2 integer but u cant use a+b method, you have to use either ++ or --. 
	 * How you will handle negative numbers.
	 */
	
	public static int sum(int a, int b) {
		  while(a > 0) { --a; ++b;};
		  while(a < 0) { ++a; --b;};
		  return b;
		}
}
