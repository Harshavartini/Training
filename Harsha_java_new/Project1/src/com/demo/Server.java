package com.demo;

import java.io.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    private static ServerSocket num;
    private static int port=9500;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
		
    	
    	
    	num=new ServerSocket(port);
    	System.out.println("Server up and running");
    	
    	while(true) {
    		
    		Socket clientSocket=num.accept();
    	InputStream inputstream= clientSocket.getInputStream();
    		ObjectInputStream os1=new ObjectInputStream(inputstream);
    		
    		String messageString=(String)os1.readObject();
    		System.out.println(messageString);
    		os1.close();
    		clientSocket.close();
    	   num.close();
    		
    		
    		
    	}
    	
    	
    	
	}
    
	
}
