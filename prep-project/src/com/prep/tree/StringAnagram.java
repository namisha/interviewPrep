package com.prep.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringAnagram {

	//condition 1 : same lenght of string
	//condition 2 : same characters.
	public static boolean anagramString(String str1, String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		else {
			char[] word1 = str1.replaceAll("[\\s]", "").toCharArray();
		     char[] word2 = str2.replaceAll("[\\s]", "").toCharArray();
		     QuickSort.quickSortAlgoForChar(word1, 0, word1.length-1);
		     QuickSort.quickSortAlgoForChar(word2, 0, word2.length-1);
//		     Arrays.sort(word1);
		    // Arrays.sort(word2);
		    	 return Arrays.equals(word1, word2);
		}
		
	}
	
	public static boolean anagramStringUSingBubbleSort(String str1, String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		else {
			char[] word1 = str1.replaceAll("[\\s]", "").toCharArray();
		     char[] word2 = str2.replaceAll("[\\s]", "").toCharArray();
		     BubbleSort.bubbleSortForChar(word1);
		     BubbleSort.bubbleSortForChar(word2);
//		     Arrays.sort(word1);
		    // Arrays.sort(word2);
		    	 return Arrays.equals(word1, word2);
		}
		
	}

	public static boolean withoutUsingSorting(String a, String b){
		
		char[] word1 = a.toCharArray();
		char[] word2 = b.toCharArray();

		Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

		for (char c : word1) {
		    int count = 1;
		    if (lettersInWord1.containsKey(c)) {
		        count = lettersInWord1.get(c) + 1;
		    }
		    lettersInWord1.put(c, count);
		}

		for (char c : word2) {
		    int count = -1;
		    if (lettersInWord1.containsKey(c)) {
		        count = lettersInWord1.get(c) - 1;
		    }
		    lettersInWord1.put(c, count);
		}

		for (char c : lettersInWord1.keySet()) {
		    if (lettersInWord1.get(c) != 0) {
		        return false;
		    }
		}

		return true;
	}
	public static void main(String[] args){
		boolean b = StringAnagram.anagramString("bob", "obb");
		boolean c = StringAnagram.anagramStringUSingBubbleSort("boba", "obba");
		boolean d = StringAnagram.withoutUsingSorting("boba", "obba");
		System.out.println(d);
		System.out.println(b);
		System.out.println(c);
	}
}
