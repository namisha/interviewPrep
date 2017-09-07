package com.prep.tree;

public class MirrorImageTrees {

	public static boolean findIfTreesAreMirrorOfEachOther(Node n1, Node n2){
		
		if(n1==null || n2==null){
			return true;
		}
		if((n1!=n2) || (n1==null && n2!=null) || (n1!=null && n2==null)){
			return false;
		}
		return findIfTreesAreMirrorOfEachOther(n1.left,n2.right) && findIfTreesAreMirrorOfEachOther(n2.right,n1.left);
	}
}
