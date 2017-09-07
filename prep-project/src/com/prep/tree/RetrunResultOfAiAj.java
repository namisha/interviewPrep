package com.prep.tree;

/*Apple Map Team 
1. Given an array A and some queries, query(i, j) returns the result of Ai*...*Aj, in other words the multiplication from Ai to Aj. 
The numbers in A are non-negative. 
Implement query(i, j). 
*/
public class RetrunResultOfAiAj {

	public static int findProd(int i,int j, int[] a){
		if(a==null){
			return 0;
		}
		if(i>a.length-1 || j>a.length-1 || i<0 || j<0){
			return 0;
		}
//		if(i==j){
//			return a[i]*a[j];
//		}
		int m = j-i+1;
		int product = 1;
		if(m>=1){
			product = a[i] * findProd(i+1,j,a);
		}
		return product;
	}
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7};
		int b[] = {1,2,3,0,5,6,7};
		int c[] = {1};
		int d[] = {};
		int e[] = {1,1,1,1,1,1,0};
		System.out.println(RetrunResultOfAiAj.findProd(1, 4, a));
		System.out.println(RetrunResultOfAiAj.findProd(1, 4, b));
		System.out.println(RetrunResultOfAiAj.findProd(1, 4, c));
		System.out.println(RetrunResultOfAiAj.findProd(1, 4, d));
		System.out.println(RetrunResultOfAiAj.findProd(1, 4, e));
		
		System.out.println(RetrunResultOfAiAj.findProd(1, 14, b));
//		System.out.println(RetrunResultOfAiAj.findProd(1, 1, b)); wont work if i and j is same.
	}
}
