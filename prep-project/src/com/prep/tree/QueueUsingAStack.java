package com.prep.tree;

public class QueueUsingAStack {
	static final int MAX = 1000;
	static int top;
	static int a[] = new int[MAX]; // Maximum size of Stack
	public static boolean push(int d){
		if(top>=MAX){
			System.out.println("Overflow");
			return false;
		}
		a[++top] = d;
		return true;
	}
	public static boolean pop(){
		if(top<0){
			System.out.println("Underflow");
			return false;
		}
		top--;
		return true;
	}
	public static int remove(){
		QueueUsingAStack.pop();
		if(top<=0)
		{
			System.out.println("stack is empty");
			return a[top];
		}
		else{
			int b = remove();
			push(top); 
			return b;
			
		}
		
	}
	public static void main(String[] args) {
		QueueUsingAStack.push(2);
		QueueUsingAStack.push(50);
		QueueUsingAStack.push(5);
		QueueUsingAStack.push(4);
		QueueUsingAStack.remove();
		
	}
}
