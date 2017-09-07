package com.prep.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ThreadSafeIterator {
	
	public static void threadsafeList(){
		List<String> safeList = Collections.synchronizedList(new ArrayList<>());
		safeList.add("a");
		safeList.add("b");
		safeList.add("c");
		safeList.add("d");
		safeList.add("e");
		Iterator<String> iterator = safeList.iterator();
		synchronized (safeList) {
		while (iterator.hasNext()) {
		    String next = iterator.next();
//		    safeList.add("f"); Exception in thread "main" java.util.ConcurrentModificationException
		    System.out.println(next);
		}
		}
	}
	
	public static void threadunsafeList(){
		List<String> unsafeList = new ArrayList<>();
		unsafeList.add("a");
		unsafeList.add("b");
		unsafeList.add("c");
		unsafeList.add("d");
		unsafeList.add("e");
		Iterator<String> iterator = unsafeList.iterator();
		 
		while (iterator.hasNext()) {
		    String next = iterator.next();
//		    unsafeList.add("f");  //Exception in thread "main" java.util.ConcurrentModificationException
		    System.out.println(next);
		}
	}
	
	public static void threadunsafeListforLoop(){
		List<String> unsafeList = new ArrayList<>();
		unsafeList.add("a");
		unsafeList.add("b");
		unsafeList.add("c");
		unsafeList.add("d");
		unsafeList.add("e");
		
		for(int i=0;i<unsafeList.size();i++) {
		    String next = unsafeList.get(i);
		    unsafeList.add("f");  //will go in infinite loop
		    System.out.println(next);
		}
	}
	
	public static void main(String[] args){
//		ThreadSafeIterator.threadsafeList();
//		ThreadSafeIterator.threadunsafeList();
		ThreadSafeIterator.threadunsafeListforLoop();
	}

}
