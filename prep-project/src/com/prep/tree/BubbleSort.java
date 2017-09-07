package com.prep.tree;

public class BubbleSort {

	public int[] bubbleSort(int[] a){
		int n = a.length;
		int k;
		for(int m=n;m>0;m--){
			for(int i=0;i<n-1;i++){
				k = i+1;
				if(a[i]>a[k]){
					int temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}

		return a;
	}
	
	public static char[] bubbleSortForChar(char[] a){
		int n = a.length;
		int k;
		for(int m=n;m>0;m--){
			for(int i=0;i<n-1;i++){
				k = i+1;
				if(a[i]>a[k]){
					char temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}

		return a;
	}

	public void bubbleSort(int arr[], int n)  //optimized by breaking when swapping doenst happen improves time complexity.
	{
		int i, j;
		boolean swapped;
		for (i = 0; i < n-1; i++)
		{
			swapped = false;
  			for (j = 0; j < n-i-1; j++)    //can use for(int m=n;m>0;m--), for(int i=0;i<n-1;i++){
			{
				if (arr[j] > arr[j+1])
				{int temp = arr[j];
				arr[i] = arr[j+1];
				arr[j+1] = temp;


				swapped = true;
				}
			}

			// IF no two elements were swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		BubbleSort bb = new BubbleSort();
		int[] b =  bb.bubbleSort(input);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.println("\n");
		char[] c = {'b','o','b'};
		char[] d =  bb.bubbleSortForChar(c);
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + ", ");
		}
		

	}
}
