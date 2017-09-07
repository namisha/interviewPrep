package com.prep.tree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberOfWordsInAFile {

	public static void main(String args[]) throws FileNotFoundException{
	File file = new File("sample.txt");
	try(Scanner sc = new Scanner(new FileInputStream(file))){
	    int count=0;
	    while(sc.hasNext()){
	        sc.next();
	        count++;
	    }
	System.out.println("Number of words: " + count);
	}
	}
}
