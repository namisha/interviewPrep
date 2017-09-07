package com.prep.tree;

public class JavaConcatFunctionTest {

	public static String concat1(String a, String b) { 
		return a + b; 
		} 
	public static String concat4(String a, String b) { 
		return b + b +a; 
		} 

	public static int concat1(int a, int b) { 
		return a + b; 
		} 

		public static String concat2(String a, String b) { 
		return a.concat(b); 
		}
		
		public static String concat3(String a, String b) { 
			return b.concat(a); 
			}

		//a remains unchanged in concat1 where as in concat2 a is changed
		public static void main(String[] args){
			System.out.println(concat1("hello","wprls"));
			System.out.println(concat4("hello","wprls"));
			System.out.println(concat1("",""));
			System.out.println(concat1(1,22));
			System.out.println(concat2("hello","wprls"));
			System.out.println(concat3("hello","wprls"));
		}
}
