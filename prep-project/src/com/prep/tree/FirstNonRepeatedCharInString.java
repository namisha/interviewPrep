package com.prep.tree;

import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeatedCharInString {

	public static void findNonRepeatedChar(String s){
		//O(n^2)
		char[] a = s.toCharArray();
		for(int i=0;i<s.length();i++){
			int repeated = 0;
			for(int j=0;j<s.length();j++){
				if(i!=j && a[i]==a[j]){
					repeated = 1;
					break;
				}
			}
			if(repeated==0){
				System.out.println(a[i]);
				break;
			}
		}
	}
	public static void lessComplexity(String s){ //O(n)
		char[] a = s.toCharArray();
		LinkedHashMap<Character,Integer> c = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<a.length;i++){
			if(c.get(a[i])==null){
				c.put(a[i], 1);
			}
			else {
				c.put(a[i], c.get(a[i])+1);
			}
		}
	
		for(Map.Entry<Character, Integer> entry : c.entrySet()){
			if(entry.getValue()==1){
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	public static void main(String[] args) {
//		findNonRepeatedChar("abdxaddb");
//		findNonRepeatedChar("abdcaddbx");
		lessComplexity("abdxaddb");
		lessComplexity("abdcaddbx");
	}
}
