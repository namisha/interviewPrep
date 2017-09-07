package com.prep.tree;

public class StringReversal {

	public static String reverse(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
	//Reverse a string , . don't use any temp variable to store the string .

	public static String reverse2(String text) {
        return reverseHelper(text.length() - 1, text.toCharArray());
    }
    
    private static String reverseHelper(int index, char[] text) {
        return index < 0? "" : text[index] + reverseHelper(index - 1, text);
    }

	public static void main(String[] args){
//		System.out.println(StringReversal.reverse("hello      world"));
		System.out.println(StringReversal.reverse2("hello      world"));
	}
}
