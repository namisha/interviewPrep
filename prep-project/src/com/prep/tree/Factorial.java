package com.prep.tree;

public class Factorial {
	int a = 1;
	public int factorial(int n){
//		int a = 0;
		if(n==0){
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
//		return a;
	}
	public static void main(String[] args){
		Factorial f = new Factorial();
		System.out.println(f.factorial(7));
	}
}
