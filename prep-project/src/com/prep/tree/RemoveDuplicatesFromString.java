package com.prep.tree;

import java.util.HashSet;

public class RemoveDuplicatesFromString {

	private static String removeDuplicateCharactersFromWord(String word) {

	    String result = new String("");

	    for (int i = 0; i < word.length(); i++) {
	        if (!result.contains("" + word.charAt(i))) {
	            result += "" + word.charAt(i);
	        }
	    }

	    return result;
	}
	public static String removeDuplicateMethod2(String s){
		char[] chars = s.toCharArray();
	    HashSet<Character> charz = new HashSet<Character>();

	    for(Character c : s.toCharArray() )
	    {
	        if(!charz.contains(c))
	        {
	            charz.add(c);
	            //System.out.print(c);
	        }
	    }

	    for(Character c : charz)
	    {
	        System.out.print(c);
	    }
		return charz.toString();
	}
	public static void main(String[] args){
		System.out.println(RemoveDuplicatesFromString.removeDuplicateCharactersFromWord("hello world"));
		System.out.println(RemoveDuplicatesFromString.removeDuplicateMethod2("hello world")); //removes the space.
	}
}
