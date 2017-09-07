package com.prep.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
	    List<Integer> ret = new ArrayList<Integer>();
        for(int i : nums){
            if(h.containsKey(i)){
                h.put(i, h.get(i) + 1);
            }
            else {
                h.put(i,1);
            }
        }
        if(h.size() == nums.length){
            for(int a : nums){
                ret.add(a);
            }
        }
        else if(h.size() == 1){
          for ( Map.Entry<Integer, Integer> entry : h.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
              ret.add(key);
        }
        }
        else { PriorityQueue<Map.Entry<Integer, Integer>> pque = 
        	    new PriorityQueue<Map.Entry<Integer, Integer>>((o1, o2) -> o2.getValue() - o1.getValue());
        	    pque.addAll(h.entrySet());
        	    for(int i = 0; i < k; i++){
        	        ret.add(pque.poll().getKey());
        	    }
        }
        	    return ret;
    }
	
	public static void main(String args[]){
		TopKFrequentElements s = new TopKFrequentElements();
		int[] nums = {1,3,2,2,1,3,5,4};
		int[] n = {1};
		int[] p = {2,2,2,2,3,4};
		System.out.println(s.topKFrequent(nums,3).toString());
		System.out.println(s.topKFrequent(p,1).toString());
		System.out.println(s.topKFrequent(n,1).toString());

	}
}
