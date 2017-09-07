package com.prep.tree;

public class IfNumIsPerfectSqaure {

	public boolean isPerfectSquare(int n) {
		int sum = 0;
		if(n == 0 || n<0) {
			return false;
		}
		else if(n ==1){
			return true;
		}
		else {
			for(int i=1;i<n;i+=2){
				sum = sum+i;
				if(sum == n)
				{
					return true;
				}   
			}
			return false;
		}
	}
	public static void main(String args[]){
		IfNumIsPerfectSqaure s = new IfNumIsPerfectSqaure();
		System.out.println(String.valueOf(s.isPerfectSquare(4)));
		System.out.println(String.valueOf(s.isPerfectSquare(0)));
		System.out.println(String.valueOf(s.isPerfectSquare(1)));
		System.out.println(String.valueOf(s.isPerfectSquare(2)));
		System.out.println(String.valueOf(s.isPerfectSquare(121)));
		System.out.println(String.valueOf(s.isPerfectSquare(2500)));
		System.out.println(String.valueOf(s.isPerfectSquare(6000)));
		System.out.println(String.valueOf(s.isPerfectSquare(-4)));

	}
}
