package com.prep.tree;

public class SinglyLinkedList {

	
	private LinkedListNode head;
	private LinkedListNode tail;
	
	public void traverseList(){
		LinkedListNode currentNode = head;
		int length = 0;
		while(currentNode != null){
			length++;
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
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
	public void addToListAfter(int dataToadd, int afterThis){
		LinkedListNode currentNode = head;
		LinkedListNode refNode = new LinkedListNode();
        System.out.println("Traversing all nodes..");
        /**
         * Traverse till given element
         */
        while(true){
            if(currentNode == null){
                break;
            }
            if(currentNode.getData() == afterThis){
                //found the target node, add after this node
                refNode = currentNode;
                break;
            }
            currentNode = currentNode.getNext();
        }
        if(refNode != null){
            //add element after the target node
        	LinkedListNode nd = new LinkedListNode();
            nd.setData(dataToadd);
            nd.setNext(currentNode.getNext());
            if(currentNode == tail){
                tail = nd;
            }
            currentNode.setNext(nd);
             
        } else {
            System.out.println("Unable to find the given element...");
        }
	}
	//returns pointer to the element
	public LinkedListNode searchingList(int key){
		LinkedListNode currentNode = head;
		while((currentNode != null) && (currentNode.getData() != key)){
			currentNode = currentNode.getNext();
		}
		if(currentNode.getData()==key){
			return currentNode;
		}
		else {
			System.out.println("data not found");
		return null; 
		}
	}
	
	public void deleteFromBegginingOfList(){
		if(head == null){
            System.out.println("Underflow...");
        }
		LinkedListNode currentNode = head;
        head = currentNode.getNext();
        if(head == null){
            tail = null;
        }
        System.out.println("Deleted: "+currentNode.getData());
	}
	public void deleteFromBetweenTheList(int key){
		if(head == null){
            System.out.println("Underflow...");
        }
		LinkedListNode currentNode = head;
		while((currentNode != null) && (currentNode.getData() != key)){
			head = currentNode;
			currentNode = currentNode.getNext();
		}
		if(currentNode.getData()==key){
			head.setNext(currentNode.getNext());
	}
        System.out.println("Deleted: "+key);
	}
	public static void main(String a[]){
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addToList(4);
        sl.addToList(3);
        sl.addToList(32);
        sl.addToList(54);
        sl.addToList(89);
        sl.addToListAfter(33, 54);
        sl.traverseList();
        sl.searchingList(54);
        sl.deleteFromBegginingOfList();
        sl.addToList(4);
        sl.deleteFromBetweenTheList(54);
      
         
    }
}
