package com.panjoy.controller;

import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile rf=new RandomAccessFile("test.dat", "rw");
		for (int i = 0; i < 10; i++) {
			rf.writeInt(i*10);
			
		}
		rf.close();
		

	}

}
