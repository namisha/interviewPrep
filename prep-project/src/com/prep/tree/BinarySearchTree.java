package com.prep.tree;

public class BinarySearchTree {

	//One reason to use trees might be because you want to store information that naturally forms a hierarchy. 

	Node root;
	BinarySearchTree(int key)
	{
		root = new Node(key);
	}

	BinarySearchTree()
	{
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}
	/* A recursive function to insert a new key in BST */
	public Node insertRec(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	// This method mainly calls InorderRec()
	public void inorder()  {
		inorderRec(root);
	}
	
	public void preorder()  {
		preorderRec(root);
	}
	
	public void postorder()  {
		postorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	
	public void preorderRec(Node root) {
		if (root != null) {
			System.out.println(root.key);
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}
	
	public void postorderRec(Node root) {
		if (root != null) {
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.println(root.key);
		}
	}
	
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();
		//				tree.root = new Node(100);
		//				tree.root.left = new Node(60);
		//				tree.root.right = new Node(150);
		//				tree.root.left.left = new Node(45);
		//				tree.root.left.right = new Node(75);

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		System.out.println("inorder");
		tree.inorder();
		System.out.println("preoder");
		tree.preorder();
		System.out.println("postorder");
		tree.postorder();
		
	//worst case time complexity of is O(h) where h is height of Binary Search Tree. 
//		In worst case, we may have to travel from root to the deepest leaf node
	
	
//		Let us see different corner cases.
//		Complexity function T(n) — for all problem where tree traversal is involved — can be defined as:
//
//		T(n) = T(k) + T(n – k – 1) + c
//
//		Where k is the number of nodes on one side of root and n-k-1 on the other side.
	}
}

