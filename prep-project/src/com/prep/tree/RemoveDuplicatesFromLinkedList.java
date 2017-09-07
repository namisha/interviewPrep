package com.prep.tree;

import java.util.Hashtable;

public class RemoveDuplicatesFromLinkedList {

	private LinkedListNode head;
	private LinkedListNode tail;
	
	public void removeDuplicatesUsingBuffer(){
		Hashtable table = new Hashtable();
		LinkedListNode currentNode = new LinkedListNode();
		while(head!=null){
			if(table.containsKey(head.data)){
			currentNode.next = head.getNext();
			}
			else {
				table.put(head.getData(), true);
				currentNode = head;
			}
			head = head.getNext();
		}	
		traverseList();
	}
	
	public void removeDuplicatesWithoutBuffer(){
		LinkedListNode currentNode = head.getNext();
		while(currentNode!=null){
			LinkedListNode runnerNode = head;
			while(runnerNode != currentNode){
				if(runnerNode.getData() == currentNode.getData()){
					LinkedListNode temp = currentNode.getNext();
					head.next = temp;
					currentNode = temp;
					break;
				}
				runnerNode = runnerNode.getNext();
			}
			if(runnerNode == currentNode){
				head =currentNode;
				currentNode = currentNode.getNext();
				
			}
		}
	}
	
	public void addToList(int data){
		LinkedListNode currentNode = new LinkedListNode();
		currentNode.setData(data);
		if(head == null){//beginning
			//since there is only one element, both head and
            //tail points to the same object.
			currentNode.next = null;
			head = currentNode;
			tail = currentNode;
		}
		else{ //between
			tail.setNext(currentNode);
			tail = currentNode;
		}
	}
	
	public void traverseList(){
		LinkedListNode currentNode = head;
		int length = 0;
		while(currentNode != null){
			length++;
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}
	public static void main(String a[]){

        RemoveDuplicatesFromLinkedList sl = new RemoveDuplicatesFromLinkedList();
        sl.addToList(4);
        sl.addToList(3);
        sl.addToList(32);
        sl.addToList(89);
        sl.addToList(54);
        sl.addToList(89);
        sl.addToList(3);
        sl.removeDuplicatesUsingBuffer();
        sl.addToList(4);
        sl.addToList(3);
        sl.addToList(32);
        sl.addToList(89);
        sl.addToList(54);
        sl.addToList(89);
        sl.addToList(3);
        sl.removeDuplicatesWithoutBuffer();
      
         
    }
}
