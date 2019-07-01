package com.demo.basics;

public class Calculator {
              
	public void add(int a, int b){
		System.out.println(a+b);
		
	}
	public void add(int a, int b, int c){
		System.out.println(a+b+c);
		
	}
	public void add(float a, float b){
		System.out.println(a+b);
		
	}
	public void add(float a, float b, float c){
		System.out.println(a+b+c);
		
	}
	
	public void mul(int a, int b){
		System.out.println(a*b);
		
	}
	public void mul(int a, int b, int c){
		System.out.println(a*b*c);
		
	}
	public void mul(float a, float b){
		System.out.println(a*b);
		
	}
	public void mul(float a, float b, float c){
		System.out.println(a*b*c);
		
	}
	public void sub(int a, int b){
		System.out.println(a-b);
		
	}
	public void sub(int a, int b, int c){
		System.out.println((a-b)-c);
		
	}
	
	public void sub(float a, float b){
		System.out.println(a-b);
		
	}
	public void sub(float a, float b, float c){
		System.out.println((a-b)-c);
		
	}
	public void div(int a, int b){
		System.out.println(a/b);
		
	}
	public void div(int a, int b, int c){
		System.out.println((a/b)/c);
		
	}
	public void div(float a, float b){
		System.out.println(a/b);
		
	}
	public void div(float a, float b, float c){
		System.out.println((a/b)/c);
		
	}
	public static void main(String[] args){
		
		Calculator c=new Calculator();
		
		c.add(1,2);
		c.add(1,2,3);
		c.add(1.2f,2.3f);
		c.add(1.2f,2.3f,4.5f);
		c.sub(1,2);
		c.sub(1,2,3);
		c.sub(3.1f,2.1f);
		c.sub(3.1f,2.1f,1.1f);
		
		
		
		
	}
}
