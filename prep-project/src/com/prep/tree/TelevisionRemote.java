package com.prep.tree;

public class TelevisionRemote {

	public static int calculateMinCount(int[] a, int start, int end){

		int len = a.length;
		if(len>0){
		int[][] adjMat = new int[len][len];
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				int hopForPrev = 0;
				int e = 0;
				if(a[j]<=end && a[i]<=end){
				if(a[j]>a[i]){
				 e = a[j]-a[i];
				}
				else if(a[j]<a[i]){
					 e = a[i]-a[j];
				}
				else if(a[i]==a[j] && i!=j){
					hopForPrev = 1;
				}
				int lengthOfd = String.valueOf(a[j]).length();

				if(e<lengthOfd && hopForPrev==0){
					adjMat[i][j] = e;
				}
				else if(hopForPrev==1){
					adjMat[i][j] = hopForPrev;
				}
				else {
					adjMat[i][j] = lengthOfd;
				}
				}
				else {
					System.out.println("any channel cant be more than end");
					return 0;
				}
			}
		}
		
		int count = 0;
		int startDiff;
		if(start<a[0]){
			 startDiff = a[0]-start;
		}
		else{
		 startDiff = start-a[0];
		}
		int lengthOfV = String.valueOf(a[0]).length();
		if(startDiff<lengthOfV){
			count = count + startDiff;
		}
		else {
			count = count + lengthOfV;
		}
		
		for(int n = 0;n<len;n++){
			int p = n+1;
			if(p<len){
			count = count + adjMat[n][p];
			}
		}
		return count;
		}
		return 0;
	}
	public static void main(String args[]) {
		int[] a = {200,300,301,500,700,10};	
		int c = calculateMinCount(a,1,900);
		System.out.println(c);
		int[] z = {};	
		int x = calculateMinCount(z,1,900);
		System.out.println(x);
		int[] v = {100,100};	
		int b = calculateMinCount(v,100,900);
		System.out.println(b);
		int[] k = {900,1000, 10005};	
		int l = calculateMinCount(k,100,900);
		System.out.println(l);
		int[] o = {900,100, 100};	
		int p = calculateMinCount(o,100,900);
		System.out.println(p);
	}
}
