//package com.prep.tree;
//
//import com.prep.tree.Node;
//
//public class BreadthFirstTraversal {
//	Node root;
//	LinkedListNode node;
////	BinaryTreeNotationABCQuestion()
////	{
////		root = null;
////	}
//	
//	/* Linked list Node*/
//    public static class LinkedListNode
//    {
//        int data;
//        LinkedListNode next;
//        LinkedListNode(int d) {data = d; next = null; }
//    }
//	
//	public void insertRec(int data){
//		root = insertInTree(root,data);
//	}
//	public Node insertInTree(Node root,int data){
//		
//		if (root == null){
//			root = new Node(data);
//			return root;
//		}
//		if(data<root.key){
//			root.left = insertInTree(root.left,data);
//		}
//		else if(data>root.key){
//			root.right = insertInTree(root.right,data);
//		}
//		return root;
//	}
//	
//	public int bfs(Node n){
//		int level = 0;
//		if(n == null){
//			return null;
//		}
//		while(root!=null){
//		LinkedListNode l1 = new LinkedListNode(root.key);
//		level = level+1;
//		level = level +bfs(root.left);
//		level = level + bfs(root.right);
//		}
//		while(root.left!=null)
//		return n;
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		BreadthFirstTraversal tree = new BreadthFirstTraversal();
//	tree.insertRec(5);
//	tree.insertRec(2);
//	tree.insertRec(8);
//	tree.insertRec(3);
//	tree.insertRec(6);
//	tree.insertRec(9);
//	tree.insertRec(1);
//	}
//}
