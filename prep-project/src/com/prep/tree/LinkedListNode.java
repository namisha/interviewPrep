package com.prep.tree;

public class LinkedListNode {
	 protected int data;
	    protected LinkedListNode next;
	 
	    /*  Constructor  */
	    public LinkedListNode()
	    {
	    	next = null;
	        data = 0;
	    }    
	    /*  Constructor  */
	    public LinkedListNode(int d,LinkedListNode n)
	    {
	        data = d;
	        next = n;
	    }    
	    /*  Function to set link to next Node  */
	    public void setNext(LinkedListNode n)
	    {
	    	next = n;
	    }    
	    /*  Function to set data to current Node  */
	    public void setData(int d)
	    {
	        data = d;
	    }    
	    /*  Function to get link to next node  */
	    public LinkedListNode getNext()
	    {
	        return next;
	    }    
	    /*  Function to get data from current Node  */
	    public int getData()
	    {
	        return data;
	    }
}
