package com.prep.tree;

public class StackUsingLinkedList {

	Node top;
	
	public static class Node {
		int key;
		Node next;

		public Node(int item)
		{
			key = item;
			next = null;
		}
	}
	
	public boolean push(int d){

		Node n = new Node(d);
		n.next = top;
		top = n;
		return true; 
	}
	public boolean pop(){
		if(top!=null){
		int temp = top.key;
		top = top.next;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList();
		s.push(2);
		s.push(50);
		s.push(5);
		s.pop();
		s.push(4);
		
		//not working.
	}
}
