package com.prep.tree;

public class StackUsingArray {

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	StackUsingArray()
	{
		top = -1;
	}
	public boolean push(int d){
		if(top>=MAX){
			System.out.println("Overflow");
			return false;
		}
		a[++top] = d;
		return true;
	}
		
		public boolean pop(){
			if(top<0){
				System.out.println("underflow");
				return false;
			}
			top--;
			int x = a[top];
			return true;
		}
		
	public boolean isEmpty(){
		return (top<0);
	}

	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray();
		s.push(2);
		s.push(50);
		s.push(5);
		s.pop();
		s.push(4);
	}
}
