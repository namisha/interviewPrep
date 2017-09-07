package com.prep.tree;

public class RetrunSqaureWithoutUsingStarSign {
	
	public static int retrunSquare(int n){
		int sum = 0;
		if(n==0){
			return 0;
		}
		if(n<0){
			n = Math.abs(n);
		}
		for(int i=1; i<=n;i++){
			sum = sum+n;
		}
		return sum;
	}
	
	// Return value overflows for large x and x ~ 0
	double Square(double x) {
	  return x / (1.0 / x);
	}
	
	public static void main(String args[]){
		int a = retrunSquare(99999);
		System.out.println(a);
		int b = retrunSquare(0);
		System.out.println(b);
		int c = retrunSquare(-9);
		System.out.println(c);
	}

}
