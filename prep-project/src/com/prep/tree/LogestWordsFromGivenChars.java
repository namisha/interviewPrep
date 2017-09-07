package com.prep.tree;

import java.util.ArrayList;
import java.util.List;

import com.prep.tree.Trie.TrieNode;

public class LogestWordsFromGivenChars {
	
	/*
	 * given 2 arrays wrds[] , chars[] as an input to a function such that 
wrds[] = [ "abc" , "baa" , "caan" , "an" , "banc" ] 
chars[] = [ "a" , "a" , "n" , "c" , "b"] 
Function should return the longest word from words[] which can be constructed from the chars in chars[] array. 
for above example - "caan" , "banc" should be returned 

Note: Once a character in chars[] array is used, it cant be used again. 
eg: words[] = [ "aat" ] 
characters[] = [ "a" , "t" ] 
then word "aat" can't be constructed, since we've only 1 "a" in chars[].
	 */
	
	
/*
 * If the number of alphabets possible is less, this will work 
1) Assign each alphabet in the character array a unique prime number and have this char to number mapping in a hash map. 
HashChars[] = [ "a->2" , "n->3" , "c->5" , "b->7"] 
2) Multiply each prime number corresponding to the chars in chars[] array. 
[ "a" , "a" , "n" , "c" , "b"] 
2 * 2 * 3 * 5 * 7 = 420 
3) Use the same prime number mapping and find the product of each string in the words array, 
Ignore the string who does not have a char prime no mapping from step (1), in this step find the length of each string as well 
abc = 2*7*5 = 70 ( 3 - length ) 
baa = 7*2*2 = 28 ( 3 - length ) 
caan = 5*2*2*3 = 60 ( 4- length ) 
banc = 7*2*3*5 = 210( 4-length ) 
4) Divide the number from step (2) with number for each word calculated from step (3) and return the words which 
are divisible and have the longest string length.
 */
	
	
}
