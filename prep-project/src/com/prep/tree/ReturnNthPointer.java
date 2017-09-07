package com.prep.tree;

public class ReturnNthPointer {

	private LinkedListNode head;
	private LinkedListNode tail;
	
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
	
	public LinkedListNode nthToLast(int n) {
		if(head== null){
			return null;
		}
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for(int i=0;i<n-1;i++){
			if(p2==null){
				return null; 
			}
			p2 = p2.getNext();
		}
		while(p2.getNext()!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
		//complexity is O(n[square])
	}
	
	public LinkedListNode nthToLastLessComplexity(int n) {
		if(head== null){
			return null;
		}
		LinkedListNode currentNode = head;
		int length = 0;
		while(currentNode!=null){
			currentNode = currentNode.getNext();
			length ++;
		}
		int m = length;
		int val = m-n+1;
		currentNode = head;
		for(int i=1;i<val;i++){
			currentNode = currentNode.getNext();
		}
	
		return currentNode;
		//complexity is O(n)
	}
	
	/* Takes index as argument and return data at index*/
    public int GetNthFromFirst(int index)
    {
        LinkedListNode current = head;
        int count = 0; /* index of Node we are
                          currently looking at */
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }
 
        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert(false);
        return 0;
    }
	
	public static void main(String a[]){

		ReturnNthPointer sl = new ReturnNthPointer();
        sl.addToList(4);
        sl.addToList(3);
        sl.addToList(32);
        sl.addToList(89);
        sl.addToList(54);
        sl.addToList(89);
        sl.addToList(3);
        sl.nthToLastLessComplexity(5);
}
}
