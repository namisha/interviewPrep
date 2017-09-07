package com.prep.tree;

public class DeleteMidNodeInLinkedList {
	//	Implement an algorithm to delete a node in the middle of a single linked list, given
	//	only access to that node.
	public static boolean deleteN(LinkedListNode n){
		LinkedListNode temp = new LinkedListNode();
		if(n==null || n.next==null){
			return false;
		}
		temp = n.next;
		n.next = temp.next;
		n.data = temp.data;
		return true;
	}
}
