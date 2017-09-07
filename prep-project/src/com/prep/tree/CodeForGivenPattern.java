package com.prep.tree;

public class CodeForGivenPattern {
/*1
2 3
4 5 6
7 8 9 10
11 12 13
*/
	public static void printPattern(int n)
	{
		//where n is value of last element
		int a = 1; int count = 0;
		System.out.println(a);
		count ++;
		while (a<=n){
			for(int i=0;i<=count;i++){
				a++;
				if(a<=n){
				System.out.print(a + " ");
				}
			}
			count++;
			System.out.println("");
		}
	}
	public static void main(String args[]) {
		printPattern(13);
	}
}
