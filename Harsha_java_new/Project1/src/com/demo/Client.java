package com.demo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		
		
		InetAddress host=InetAddress.getLocalHost();
		Socket socket=null;
		ObjectOutputStream oos=null;
		socket=new Socket("10.2.118.70",8888);
		System.out.println("Connected with server");
		oos=new ObjectOutputStream(socket.getOutputStream());
		oos.writeObject("Hi from HARSHA");
	oos.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
