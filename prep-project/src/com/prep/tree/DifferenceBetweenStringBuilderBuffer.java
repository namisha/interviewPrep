package com.prep.tree;

public class DifferenceBetweenStringBuilderBuffer {
	
//	1. Concat1 : In this method, we pass a string “Geeks” and perform “s1 = 
//	s1 + ”forgeeks”. The string passed from main() is not changed, this is due to the fact that String is immutable. 
//	Altering the value of string creates another object and s1 in concat1() stores reference of new string. References s1 in main() and cocat1() refer to different strings.
//
//			2. Concat2 : In this method, we pass a string “Geeks” and perform “s2.append(“forgeeks”)” 
//	which changes the actual value of the string (in main) to “Geeksforgeeks”. This is due to the simple fact that 
//	StringBuilder is mutable and hence changes its value.
//
//			2. Concat3 : StringBuffer is similar to StringBuilder except one difference that StringBuffer is thread safe, 
//	i.e., multiple threads can use it without any issue. The thread safety brings a penalty of performance.
//	
	 public static void concat1(String s1)
	    {
	        s1 = s1 + "forgeeks";
	    }
	 
	    // Concatenates to StringBuilder
	    public static void concat2(StringBuilder s2)
	    {
	        s2.append("forgeeks");
	    }
	 
	    // Concatenates to StringBuffer
	    public static void concat3(StringBuffer s3)
	    {
	        s3.append("forgeeks");
	    }
	    public static void main(String[] args)
	    {
	        String s1 = "Geeks";
	        concat1(s1);  // s1 is not changed
	        System.out.println("String: " + s1);
	 
	        StringBuilder s2 = new StringBuilder("Geeks");
	        concat2(s2); // s2 is changed
	        System.out.println("StringBuilder: " + s2);
	 
	        StringBuffer s3 = new StringBuffer("Geeks");
	        concat3(s3); // s3 is changed
	        System.out.println("StringBuffer: " + s3);
	    }
}
