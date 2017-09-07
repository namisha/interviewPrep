package com.prep.tree;

import java.util.HashSet;

public class StringWithUniqueCharacters {

	public static boolean uniqueString(String str){
		HashSet<Character> unique = new HashSet<Character>();
//		The advantage of the HashSet class is that it operates in constant time, as opposed to the O(log N) time for 
//		the Set class. 
//		The disadvantage of HashSet is that iterators return the values in a seemingly random order.
		for(int i=0; i<str.length();i++){
			unique.add(str.charAt(i));
		}
		if(unique.size()!=str.length()){
			return false;
		} else {      
		return true;
		}
	}

	public static void main(String[] args){
		boolean b = StringWithUniqueCharacters.uniqueString(" aabb");
		System.out.println(b);
	}
}
