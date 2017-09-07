package com.prep.tree;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {

	public int sumEvenUnboxing(List<Integer> li) {
	    int sum = 0;
	    for (Integer i: li)
	        if (i % 2 == 0)
	            sum += i;
	        return sum;
	}
	
	public void autobxing(){
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 2; i += 2){
		    li.add(i);
		}
	}
	
	//**********compiler converts and interpretes
//	public static int sumEven(List<Integer> li) {
//	    int sum = 0;
//	    for (Integer i : li)
//	        if (i.intValue() % 2 == 0)
//	            sum += i.intValue();
//	        return sum;
//	}
	//********
	
	public static void main(String args[]){
		AutoboxingExample obj = new AutoboxingExample();
		List<Integer> li = new ArrayList<>();
		li.add(1);
		
		obj.autobxing();
		obj.sumEvenUnboxing(li);
		
	}
}
