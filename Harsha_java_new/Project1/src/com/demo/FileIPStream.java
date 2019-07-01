package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIPStream {
         public static void main(String[] args) throws IOException {
			
        	 
        	 File file1=null;
        	
        	 FileInputStream fileinputstream= null;
        	 FileOutputStream fileoutputstream=null;
        	 file1=new File("output1.txt");
        	 fileinputstream =new FileInputStream(file1);
        	 
        	 byte arr[]=new byte[100];
        	 fileinputstream.read(arr);
        	 fileinputstream.close();
        	 
        	 file1=new File("output2.txt");
        	 fileoutputstream =new FileOutputStream(file1,true);
        	 fileoutputstream.write(arr);
        	 fileoutputstream.flush();
        	 fileoutputstream.close();
        	 
        	
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
		}
}
