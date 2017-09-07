package com.prep.tree;

public class RotationalStrings {

	public static boolean checkForRotation(String a, String b){
		String c = null;
		if(a.length()!=b.length()){
			return false;
		}
	
			if(b!=null){
			 c = b.concat(b);
			}
			if(c.contains(a)){
				return true;
			}
			else {
				return false;
			}
	}
	public static void main(String[] args){
		System.out.println(RotationalStrings.checkForRotation("apple", "pleap"));
//		System.out.println(RotationalStrings.checkForRotation(null, "pleap"));
//		System.out.println(RotationalStrings.checkForRotation(null, null));
	}
}
