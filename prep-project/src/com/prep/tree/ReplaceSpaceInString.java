package com.prep.tree;

public class ReplaceSpaceInString {

	public static String replacespace(String str){
		 String[] words = str.split(" ");
		    StringBuilder sentence = new StringBuilder(words[0]);

		    for (int i = 1; i < words.length; ++i) {
		        sentence.append("%20");
		        sentence.append(words[i]);
		    }

		    return sentence.toString();
	}
	public static String replaceSpaceInString(String s){
	    int i;
	    for (i=0;i<s.length();i++){
	        System.out.println("i is "+i);
	        if (s.charAt(i)==(int)32){
	            s=s.substring(0, i)+"%20"+s.substring(i+1, s.length());
	            i=i+2;              
	            }
	    }
	    return s;
	    }
	public static void main(String[] args){
//		System.out.println(ReplaceSpaceInString.replacespace("hello world .")); //discarding because doesnt work for space in end
		System.out.println(ReplaceSpaceInString.replaceSpaceInString(" hello world "));
		System.out.println(ReplaceSpaceInString.replaceSpaceInString(" "));
	}
}
