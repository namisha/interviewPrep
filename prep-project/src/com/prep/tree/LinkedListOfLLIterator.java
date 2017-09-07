package com.prep.tree;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOfLLIterator {
	
	public static void main(String[] args)
	{
		
		LinkedList<LinkedList<String>> list = new LinkedList<LinkedList<String>>();

		LinkedList sublist1 = new LinkedList();
		sublist1.add("a");
		sublist1.add("b");
		sublist1.add("c");
		list.add(sublist1);
		LinkedList sublist2 = new LinkedList();
		sublist2.add("d");
		sublist2.add("e");
		sublist2.add("f");
		list.add(sublist2);
		

		for(LinkedList ll : list){
			Iterator<String> iterator = ll.iterator();
			while(iterator.hasNext()){
				String next = iterator.next();
				System.out.println(next);
			}
		}
	}
}
