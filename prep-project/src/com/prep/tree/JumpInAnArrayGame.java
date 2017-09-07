package com.prep.tree;

public class JumpInAnArrayGame {
	    public boolean canJump(int[] nums) { 
	        int len = nums.length;
	        for(int i=0;i<len;i++){
	        	if(len==1){
	        		return true;
	        	}
	            if(nums[i] == 0){
	                return false;
	            }
	            if((i+nums[i])>len){
	                return false;
	            }
	            i = i+nums[i];   
	        }
	        return true;
	    }
	    
	   public  boolean landOnLast(int[] arr, int len)
	    {
	    	for(int i = 0; i < len; i++)
	    	{
	    		if (arr[i] == 0){
	    			return false; // sorry, you're stuck
	    		}
	    		if ( (arr[i] + i) > len){
	    			return false;// sorry, you're past the length of the array
	    		}
	    		i = i+arr[i];
	    	}
	    	return true;
	    }
	    public static void main(String args[]){
	    	JumpInAnArrayGame j = new JumpInAnArrayGame();
	    	int[] nums = {1,2,3,5};
	    	boolean b = j.canJump(nums);
	    	System.out.println(b);
	    	
	    	int[] m = {1,2,3,1,0,1};
	    	boolean a = j.canJump(m);
	    	System.out.println(a);
	    	
//	    	int[] n = {1,2,3,5, 0,1};
//	    	boolean c = j.canJump(n);
//	    	System.out.println(c);
	    	
	    	int[] n = {1,2,3};
	    	boolean c = j.canJump(n);
	    	System.out.println(c);
	    	
	    	int[] p = {0};
	    	boolean d = j.canJump(p);
	    	System.out.println(d);
	    	
	    	int[] q = {2,3,1,1,0};
	    	boolean e = j.canJump(q);
	    	System.out.println(e);
	    	
	    	int[] r = {2,3,1,1,4};
	    	boolean f = j.canJump(r);
	    	boolean x = j.landOnLast(r, 5);
	    	System.out.println(f);
	    	System.out.println(x);
	    	
	    }
}
