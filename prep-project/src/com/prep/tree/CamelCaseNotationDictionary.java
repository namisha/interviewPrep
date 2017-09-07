package com.prep.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CamelCaseNotationDictionary {

	 static final int ALPHABET_SIZE = 26;
	public static class TrieNode{
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];
		boolean isLeaf;
		List<String> w;
		TrieNode(){
			 isLeaf = false;
	            for (int i = 0; i < ALPHABET_SIZE; i++)
	                children[i] = null;
	            w = new ArrayList<String>();
		}
	}
	
	static TrieNode root;
	public static void insertInTrie(String word){
		int len = word.length();
		int level;
		int index;
		TrieNode t = root;
		for(level=0;level<len;level++){
			if(Character.isLowerCase(word.charAt(level))){
				continue;
			}
			index = word.charAt(level) - 'A';
			if(t.children[index] == null){
				t.children[index] = new TrieNode();
			}
			t = t.children[index];
		}
		t.isLeaf = true;
		t.w.add(word);
	}
	
	public static boolean searchInTrie(String pattern){
		int index;
		TrieNode p = root;
		for(int i=0;i<pattern.length();i++){
			index = pattern.charAt(i) - 'A';
			if(p.children[index] == null){
				break;
			}
			p = p.children[index];
		}
		return true;
	}
	
	public static void printAllWords(TrieNode root){
		if (root.isLeaf) {
            for (String str : root.w)
                System.out.println(str);
        }
 
        // recurse for all children of root node
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            TrieNode child = root.children[i];
            if (child != null)
                printAllWords(child);
        }
	}
	public static void main(String args[]) {
		 
        // dictionary of words where each word follows
        // CamelCase notation
		root = new TrieNode();
        List<String> dict = Arrays.asList("Hi", "Hello",
                           "HelloWorld", "HiTech", "HiGeek",
                          "HiTechWorld", "HiTechCity",
                            "HiTechLab");
 
        // pattern consisting of uppercase characters only
        String pattern = "HT";
 
        for (String word : dict)
            insertInTrie(word);
        
        boolean b = searchInTrie(pattern);
        if (!b)
            System.out.println("No match found");   
        else
        	 System.out.println("match found");
        	}
	
}
