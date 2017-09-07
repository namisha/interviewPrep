package com.prep.tree;

/**
 * Created by ngoyal2 on 3/29/17.
 */
public class Instertionsort {

    public static int[] sortIncreasingorder(int arr[]){
       
        for(int i=1;i<arr.length;i++){
            int key = arr[i];  //c
            int j = i-1; //c
            while((j>-1) && (arr[j]>key)){ //
            	arr[j+1] = arr[j];
            	j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static int[] sortDecreasingorder(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            int key = arr[i];  //c
            int j = i-1; //c
            while((j>-1) && (arr[j]<key)){ //
            	arr[j+1] = arr[j];
            	j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String args[]){
    	int arr[] = {5,1,4,7,8,9,6};
    	int brr [] = Instertionsort.sortIncreasingorder(arr);
//    	int crr [] = Instertionsort.sortDecreasingorder(arr);
    	//System.out.println(brr);
    }
}
