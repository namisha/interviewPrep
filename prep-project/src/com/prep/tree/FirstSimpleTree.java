package com.prep.tree;
//
//
//class NodeOfTree {
//	NodeOfTree left, right;
//	int rootKey;
//	
//	public NodeOfTree(int rootKeyValue){
//		rootKey = rootKeyValue;
//		left = right=null;
//	}
//}

 class FirstSimpleTree {

	NodeOfTree node;

	public FirstSimpleTree(int nodeValue){
		node = new NodeOfTree(nodeValue);

	}
	public FirstSimpleTree(){
		node = null;
	}
	
	public static void main(String args[]){
		FirstSimpleTree n = new FirstSimpleTree();
		
		n.node = new NodeOfTree(5);
		
		n.node.left = new NodeOfTree(2);
		n.node.right = new NodeOfTree(7);
		
		n.node.left.left = new NodeOfTree(1);
		
		System.out.println(n.node.left.left);
	}
}

