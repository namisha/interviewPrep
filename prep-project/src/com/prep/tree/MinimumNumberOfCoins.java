package com.prep.tree;

public class MinimumNumberOfCoins {

	public static int minCoins(int[] c, int length, int val){
		int res = Integer.MAX_VALUE;
		if(val==0){
			return 0;
		}
			for(int i=0;i<length;i++){
				if(c[i]<=val){
					int a = minCoins(c,length,val-c[i]);
					if (a != Integer.MAX_VALUE && a + 1 < res)
						res = a + 1;
				}
			}
			return res;
		
	}
	
	public static void main(String args[])
	{
	int coins[] = {9, 6, 5, 1};
	int m = coins.length;
	int V = 100;
	System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
	}
}
