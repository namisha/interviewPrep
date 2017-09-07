//package com.prep.tree;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.prep.tree.CamelCaseNotationDictionary.TrieNode;
//
//public class DistinctSubstringOfString {
//
//	 static final int ALPHABET_SIZE = 26;
//		public static class TrieNode{
//			TrieNode[] children = new TrieNode[ALPHABET_SIZE];
//			boolean isLeaf;
//			List<String> w;
//			TrieNode(){
//				 isLeaf = false;
//		            for (int i = 0; i < ALPHABET_SIZE; i++)
//		                children[i] = null;
//		            w = new ArrayList<String>();
//			}
//		}
//		
//		static TrieNode root;
//		public static void insertInTrie(String word){
//			int len = word.length();
//			int level;
//			int index;
//			TrieNode t = root;
//			for(level=0;level<len;level++){
//				index = word.charAt(level) - 'a';
//				if(t.children[index] == null){
//					t.children[index] = new TrieNode();
//				}
//				t = t.children[index];
//			}
//			t.isLeaf = true;
//			t.w.add(word);
//		}
//		
//		public static boolean searchInTrie(String pattern){
//			int index;
//			TrieNode p = root;
//			for(int i=0;i<pattern.length();i++){
//				index = pattern.charAt(i) - 'A';
//				if(p.children[index] == null){
//					break;
//				}
//				p = p.children[index];
//			}
//			return true;
//		}
//		
//		public static void main(String args[]) {
//			String s = "ababa";
//			root = new TrieNode();
//			for(int i=0;i<s.length();i++){
//				insertInTrie(s.substring(i));
//			}
//		}
//}
