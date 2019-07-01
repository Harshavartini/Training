package com.demo;

/*package whatever //do not write package name here */

import java.io.*;

class Sample{
	public static void main (String[] args) {
		System.out.println("GfG!");
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		try{
		    t.sleep(15000);
		    System.out.println("I had enough seep");
		}
		catch(InterruptedException e){
		    System.out.println(e);
		}
		
	}
}