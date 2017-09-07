package com.prep.tree;

public class BinaryTreeNotationABCQuestion {

	Node root;
	
	BinaryTreeNotationABCQuestion()
	{
		root = null;
	}
	
	public void insertRec(int data){
		root = insertInTree(root,data);
	}
	public Node insertInTree(Node root,int data){
		
		if (root == null){
			root = new Node(data);
			return root;
		}
		if(data<root.key){
			root.left = insertInTree(root.left,data);
		}
		else if(data>root.key){
			root.right = insertInTree(root.right,data);
		}
		return root;
	}
	
	public String findRec(int data){
		String a = findAnotations(root,data);
		return a;
	}
	public String findAnotations(Node root,int value){
		//return 0 for left
		// return 1 for right
		//retrun Not Found for item not Found
		// return Undefined is root is null
		
		String annotation = "";
		if(root==null){
			//System.out.println("NotFound");
			annotation = "NotFound";
			return annotation;
		}
		if(root.key==value){
			return annotation;
		}
		if(value<root.key){
			annotation = annotation+"0";
			String a = findAnotations(root.left,value);
			if(a!="NotFound"){
			annotation = annotation + a;
			}
			else {
				annotation = a;
			}
		}
		
		if(value>root.key){
			annotation = annotation+"1";
			String a = findAnotations(root.right,value);
			if(a!="NotFound"){
				annotation = annotation + a;
				}
				else {
					annotation = a;
				}
		}
		return annotation;
	}
	
	public static void main(String[] args)
	{
		BinaryTreeNotationABCQuestion tree = new BinaryTreeNotationABCQuestion();
	//				tree.root = new Node(100);
	//				tree.root.left = new Node(60);
	//				tree.root.right = new Node(150);
	//				tree.root.left.left = new Node(45);
	//				tree.root.left.right = new Node(75);

	tree.insertRec(5);
	tree.insertRec(2);
	tree.insertRec(8);
	tree.insertRec(3);
	tree.insertRec(6);
	tree.insertRec(9);
	tree.insertRec(1);
	
	String c = tree.findRec(1);
	String d = tree.findRec(6);
	String e = tree.findRec(10);
	String f = tree.findRec(2);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	}
}
