package com.prep.tree;

import java.util.LinkedHashMap;
import java.util.Set;

public class FirstUniqueCharacterInString {
	 public static int firstUniqChar(String s) {
	        char[] arr = s.toCharArray();
	      LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
			for(int i=0;i<arr.length;i++){
	            if(!map.containsKey(arr[i])){
					map.put(arr[i], i);
				}
	            else {
	            	map.remove(arr[i]);
	            }
//	                Set<Character> k = map.keySet(); 
//	           return map.getKey(k);
	    }
			return 0;
	    }
	        public static void main(String[] args) {
			System.out.println(FirstUniqueCharacterInString.firstUniqChar("leetcode"));
		 }
}
