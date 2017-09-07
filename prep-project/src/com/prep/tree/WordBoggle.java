package com.prep.tree;

import com.prep.tree.Trie.TrieNode;

public class WordBoggle {

	static final int ALPHABET_SIZE = 26;
	static final int M = 3;
	static final int N = 3;
	static class TrieNode
	{
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];
		boolean isLeaf;

		TrieNode(){
			isLeaf = false;
			for (int i = 0; i < ALPHABET_SIZE; i++)
				children[i] = null;
		}
	};
	static TrieNode root; 
	static void insert(String key)
	{
		int level;
		int length = key.length();
		int index;

		TrieNode pCrawl = root;

		for (level = 0; level < length; level++)
		{
			index = key.charAt(level) - 'A';
			if (pCrawl.children[index] == null)
				pCrawl.children[index] = new TrieNode();

			pCrawl = pCrawl.children[index];
		}
		pCrawl.isLeaf = true;
	}

	 // function to check that current location
    // (i and j) is in matrix range
    static boolean isSafe(int i, int j, boolean visited[][])
    {
        return (i >=0 && i < M && j >=0 &&
                j < N && !visited[i][j]);
    }
    
	static void searchWord(TrieNode root, char boggle[][], int i,
            int j, boolean visited[][], String str)
	{
		if(root.isLeaf){
			System.out.println(str);
		}
		if(i>=0 && i<M && j>=0 && j<N && !visited[i][j]){
			visited[i][j]=true;
			for(int k=0;k<ALPHABET_SIZE;k++){
				if(root.children[k]!=null){
					 char ch = (char) (k + 'A') ;
				      
	                    // Recursively search reaming character of word
	                    // in trie for all 8 adjacent cells of 
	                    // boggle[i][j]
	                    if (isSafe(i+1,j+1,visited) && boggle[i+1][j+1]
	                                                           == ch)
	                        searchWord(root.children[k],boggle,i+1,j+1,
	                                                   visited,str+ch);
	                    if (isSafe(i, j+1,visited)  && boggle[i][j+1]
	                                                           == ch)
	                        searchWord(root.children[k],boggle,i, j+1,
	                                                  visited,str+ch);
	                    if (isSafe(i-1,j+1,visited) && boggle[i-1][j+1] 
	                                                           == ch)
	                        searchWord(root.children[k],boggle,i-1, j+1,
	                                                  visited,str+ch);
	                    if (isSafe(i+1,j, visited)  && boggle[i+1][j] 
	                                                          == ch)
	                        searchWord(root.children[k],boggle,i+1, j,
	                                                 visited,str+ch);
	                    if (isSafe(i+1,j-1,visited) && boggle[i+1][j-1] 
	                                                          == ch)
	                        searchWord(root.children[k],boggle,i+1, j-1,
	                                                  visited,str+ch);
	                    if (isSafe(i, j-1,visited)&& boggle[i][j-1] 
	                                                         == ch)
	                        searchWord(root.children[k],boggle,i,j-1,
	                                                 visited,str+ch);
	                    if (isSafe(i-1,j-1,visited) && boggle[i-1][j-1] 
	                                                         == ch)
	                        searchWord(root.children[k],boggle,i-1, j-1,
	                                                visited,str+ch);
	                    if (isSafe(i-1, j,visited) && boggle[i-1][j] 
	                                                        == ch)
	                        searchWord(root.children[k],boggle,i-1, j, 
	                                              visited,str+ch);
				}
			}
			// make current element unvisited
            visited[i][j] = false;
		}
	}

	public static void findWords(TrieNode n, char[][] boggle){
		TrieNode p = n;
		int index;
		String s = "";
		boolean[][] visited = new boolean[M][N];

		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				char c = boggle[i][j];
				index = c-'A';
				if(p.children[index]!=null){
					s = s+c;
					searchWord(p.children[index], boggle, i, j,  visited,  s);
				}
			}
		}
	}

	public static void main(String args[]){
		
	        // Let the given dictionary be following
	        String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GEE"};
	      
	        // root Node of trie
	         root = new TrieNode();
	      
	        // insert all words of dictionary into trie
	        int n = dictionary.length;
	        for (int i=0; i<n; i++) {
	            insert(dictionary[i]);
	        }
	        char boggle[][] = {{'G','I','Z'},
	                           {'U','E','K'},
	                           {'Q','S','E'}};
	      
	        findWords(root, boggle);
	              
	}
	
}
