package com.prep.tree;

public class MoveDistinctElementsToTop {
//	Given a sorted array with duplicates, move the distinct elements to the top  Ex: 1,1,2,3,4,4,5 -> 1,2,3,4,5

	public int[] giveDistinctElementsOnTop(int[]n){
		if(n.length < 1) 
			return null;

	    int i;
	    int next = 1;
	    for(i = 1; i < n.length; ++i){
	        if(n[i] == n[i-1]) continue;
	        n[next++] = n[i];
	    }
	    return n;
	}
	public static void main(String args[]){
		MoveDistinctElementsToTop m = new MoveDistinctElementsToTop();
		int [] n = {1,1,2,3,4,4,5};
		int[] b = m.giveDistinctElementsOnTop(n);
		System.out.println(b);
	}

}
