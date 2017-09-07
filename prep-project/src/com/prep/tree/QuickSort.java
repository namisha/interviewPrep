package com.prep.tree;

public class QuickSort {

	public static char[] quickSortAlgoForChar(char[] arr , int low, int high){
		if (arr == null || arr.length == 0)
			return null;
		if (low >= high)
			return null;
		//pivot 
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		// make left < pivot and right > pivot
				int i = low, j = high;
				while (i <= j) {
					while (arr[i] < pivot) {
						i++;
					}
		 
					while (arr[j] > pivot) {
						j--;
					}
		 
					if (i <= j) {
						char temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						i++;
						j--;
					}
				}
		 
				// recursively sort two sub parts
				if (low < j)
					quickSortAlgoForChar(arr, low, j);
		 
				if (high > i)
					quickSortAlgoForChar(arr, i, high);
				return arr;
	}
	public static int[] quickSortAlgoForInt(int[] arr , int low, int high){
		if (arr == null || arr.length == 0)
			return null;
		if (low >= high)
			return null;
		//pivot 
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		// make left < pivot and right > pivot
				int i = low, j = high;
				while (i <= j) {
					while (arr[i] < pivot) {
						i++;
					}
		 
					while (arr[j] > pivot) {
						j--;
					}
		 
					if (i <= j) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						i++;
						j--;
					}
				}
		 
				// recursively sort two sub parts
				if (low < j)
					quickSortAlgoForInt(arr, low, j);
		 
				if (high > i)
					quickSortAlgoForInt(arr, i, high);
				return arr;
	}
	public static void main(String[] args){
		String s = "helloworld";
//		char arr[] = s.toCharArray();
//		char[] array = QuickSort.quickSortAlgoForChar(arr, 0, arr.length-1);
		int[] a = {13,4,54,6,78,3};
		int[] b = QuickSort.quickSortAlgoForInt(a, 0, a.length-1);
	}
}
