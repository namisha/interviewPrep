package com.prep.tree;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadHugeFileUsingMultipleThreads {

	
	public static void main(String[] args) throws IOException {

	ExecutorService exec = Executors.newFixedThreadPool(10);

	// use RandomAccessFile because it supports readFully()
	RandomAccessFile in = new RandomAccessFile("/Users/ngoyal2/Untitled.xml", "r");
	in.seek(0L);

	while (in.getFilePointer() < in.length())
	{
//	    int readSize = (int)Math.min(1000000, in.length() - in.getFilePointer());
		 int readSize = (int)Math.min(10, in.length() - in.getFilePointer());
	    final byte[] data = new byte[readSize];
	    in.readFully(data);
	    exec.execute(new Runnable() 
	    {
	        public void run() 
	        {
	            // do something with data
	        }
	    });
	}
	}
}
