//package com.prep.tree;
//
//import java.util.Stack;
//
//public class DFSGraph {
//
//	public static class Vertex {
//		char label;
//		boolean visited;
//		public  Vertex(char lab){
//			this.label = lab;
//			visited = false;
//		}	
//	}
//	private final int maxNumOfVertices = 20;
//	int adj[][];
//	Vertex vertices[];
//	Stack s;
//	int vertexCount;
//	
//	public void DFSGraph(){
//		vertices = new Vertex[maxNumOfVertices];
//		adj = new int[maxNumOfVertices][maxNumOfVertices];
//		vertexCount = 0;
//		for(int i=0;i<maxNumOfVertices; i++){
//			for(int j=0;j<maxNumOfVertices;j++){
//				adj[i][j] = 0;
//				s = new Stack();
//			}
//		}
//	}
//	public void addVertices(char c){
//		vertices[vertexCount++] = new Vertex(c);
//	}
//	
//	public void addEdge(int start, int end){
//		adj[start][end] = 1;
//		adj[end][start] = 1;
//	}
//	public void displayVertex(int v){
//		System.out.println(vertices[v].label);
//	}
//	public int getAdjUnvisitedVertex(int v){
//		for(int i=0;i<vertexCount;i++){
//		if(adj[v][i] == 1 && vertices[i].visited == false){
//			return i;
//		}
//		}
//		return -1;
//	}
//	public void dfs(){
//		vertices[0].visited = true;
//		displayVertex(0);
//		s.push(0);
//		while(!s.empty()){
//			int v = getAdjUnvisitedVertex((int) s.peek());
//		}
//	}
//}
