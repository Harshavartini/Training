package com.demo;
import java.io.*;
public class FilePractice {
   public static void main(String[] args) throws IOException {
	
	   File file=null;
	   //stream is a sequence of bytes travelling from source to destination
	   FileOutputStream fileoutputstream=null;
	   
			   
	   
	   String content="This is the text context\n ";
	   String content1="Second Line\n";
	   
	   //create a file
	   file=new File("output.txt");
	   fileoutputstream=new FileOutputStream(file,true);
	   byte[] bytes=content.getBytes();
	   fileoutputstream.write(bytes);
	   fileoutputstream.write(content1.getBytes());
	   
	   fileoutputstream.flush();
	   fileoutputstream.close();
	   
	   
	   
	   
	   
}
}
