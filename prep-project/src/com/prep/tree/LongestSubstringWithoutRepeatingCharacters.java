package com.prep.tree;

import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		char[] arr = s.toCharArray();
		int lengthOfSubStr = 0;
		String subStr = null;
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], i);
			}
			else {
				i = map.get(arr[i]);
				map.clear();
			}
			if(map.size()>lengthOfSubStr){
				lengthOfSubStr = map.size();
				subStr = map.keySet().toString();
			}
		}
		return lengthOfSubStr;
	}
	
	public static void main(String[] args) {
		int a = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyabzABCDEF");		
		System.out.println(a);
	 }
}
