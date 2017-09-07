package com.prep.tree;

public class Pallindrome {

	public boolean findIfStringIsPallindrome(char[] word){
		boolean pallindrome = false;
		if((word.length)%2==0){
			for(int i=0;i<=(word.length/2)-1;i++){
				if(word[i]!=word[word.length-i-1]){
					pallindrome = false;
					break;
				}
				else {
					pallindrome = true;
				}
			}
		}
		else{
		for(int j=0;j<(word.length-1)/2;j++){
			if(word[j]!=word[word.length-j-1]){
				pallindrome = false;
				break;
			}
			else {
				pallindrome = true;
			}
		}
		}
		return pallindrome;
	}
	
	public boolean findIfStringIsPallindrome2(char[] word){
		boolean pallindrome = false;
		
			int i = 0;
			int j=word.length-1;
			while(i<=j){
				if(word[i]!=word[j]){
					pallindrome = false;
					break;
				}
				else {
					pallindrome = true;
				}
				i++;
				j--;
			}
			
			return pallindrome;
		}
	
	
	public boolean findIfIntegerIsPallindrome(int a){
		char[] word = Integer.toString(a).toCharArray();
		boolean pallindrome = false;
		if(word.length==1){
			pallindrome = true;
		}
		else if((word.length)%2==0){
			for(int i=0;i<=(word.length/2)-1;i++){
				if(word[i]!=word[word.length-i-1]){
					pallindrome = false;
					break;
				}
				else {
					pallindrome = true;
				}
			}
		}
		else{
		for(int j=0;j<(word.length-1)/2;j++){
			if(word[j]!=word[word.length-j-1]){
				pallindrome = false;
				break;
			}
			else {
				pallindrome = true;
			}
		}
		}
		return pallindrome;
	}
	
	public static void main(String[] args) {
		Pallindrome s = new Pallindrome();
		String str = "abdcecdba";
		char[] arr = str.toCharArray();
		System.out.println(s.findIfStringIsPallindrome(arr));
		System.out.println(s.findIfIntegerIsPallindrome(0));
		System.out.println(s.findIfStringIsPallindrome2(arr));
	 }
}
