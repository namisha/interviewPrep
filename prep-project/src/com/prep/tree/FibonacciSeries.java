package com.prep.tree;

public class FibonacciSeries {
	static int n1 = 0;
	static int n2 = 1;
	int n3;
	public void fiboIterative(int count){
		while(count>0){
			n3 = n1+n2;
			n1 = n2; 
			n2 = n3;
			count--;
			System.out.print(" "+n3);

//			Time Complexity: O(n)
//			Extra Space: O(1)
			//has least space complexity
		}
	}
	public void fiboRecursive(int count){
		if(count>0){
			n3 = n1+n2;
			n1 = n2; 
			n2 = n3;
			System.out.print(" "+n3);
			fiboRecursive(count-1);
		}
	}

	//Fibonacci Series using Recursion Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.
	public int fib(int n)
	{
		if (n <= 1)
			return n;
		return fib(n-1) + fib(n-2);
	}

	//	Dynamic Programming
	//	Time Complexity: O(n)
	//	Extra Space: O(n)
	public static int fibDP(int n)
	{
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n+1];
		int i;

		/* 0th and 1st number of the series are 0 and 1*/
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++)
		{
			/* Add the previous 2 numbers in the series
         and store it */
			f[i] = f[i-1] + f[i-2];
		}

		return f[n];
	}

	public static void main(String a[]){
		int count = 10;
		System.out.print(n1+" "+n2);
		FibonacciSeries f = new FibonacciSeries();
		//		f.fiboIterative(count-2);
		f.fiboRecursive(count-2);
		f.fib(count); 
	}
}
