package com.prep.tree;

import java.util.ArrayList;
import java.util.List;

public class ParanthesesCombination {

	public List<String> generateParenthesis(int n) {
	    ArrayList<String> result = new ArrayList<String>();
	    dfs(result, "", n, n);
	    return result;
	}
	
	public String dfs(ArrayList<String> result, String s, int left, int right){
	    if(left > right)
	        return null;
	 
	    if(left==0&&right==0){
	        result.add(s);
	        return s;
	    }
	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	    return s;
	}

	public static void main(String args[]){
		ParanthesesCombination p = new ParanthesesCombination();
		List<String> s = p.generateParenthesis(2);
		System.out.println(s);
		List<String> o = p.generateParenthesis(3);
		System.out.println(o);
	}
}

