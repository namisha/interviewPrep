package com.prep.tree;

/* Java program to demonstrate how to implement static and non-static
classes in a java program. */
public class NestedClassExample {
	private static String msg = "GeeksForGeeks";
    
	   // Static nested class
	   public static class NestedStaticClass{
	      
	       // Only static members of Outer class is directly accessible in nested 
	       // static class 
	       public void printMessage() {
	 
	         // Try making 'message' a non-static variable, there will be 
	         // compiler error  
	         System.out.println("Message from nested static class: " + msg); 
	       }
	    }
	    
	    // non-static nested class - also called Inner class
	    public class InnerClass{
	        
	       // Both static and non-static members of Outer class are accessible in 
	       // this Inner class
	       public void display(){
	          System.out.println("Message from non-static nested class: "+ msg);
	       }
	    }
	    
	    public static void main(String args[]){
	        
	        // create instance of nested Static class
	    	NestedClassExample.NestedStaticClass printer = new NestedClassExample.NestedStaticClass();
	         
	        // call non static method of nested static class
	        printer.printMessage();   
	   
	        // In order to create instance of Inner class we need an Outer class 
	        // instance. Let us create Outer class instance for creating 
	        // non-static nested class
	        NestedClassExample outer = new NestedClassExample();        
	        NestedClassExample.InnerClass inner  = outer.new InnerClass();
	         
	        // calling non-static method of Inner class
	        inner.display();
	         
	        // we can also combine above steps in one step to create instance of 
	        // Inner class
	        NestedClassExample.InnerClass innerObject = new NestedClassExample().new InnerClass();
	         
	        // similarly we can now call Inner class method
	        innerObject.display();
	     }
}
