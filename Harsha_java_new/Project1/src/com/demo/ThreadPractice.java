package com.demo;

public class ThreadPractice {

   public static void main(String[] args) {
	
	   
	   System.out.println("Main Thread");
	// creating threads
	// eventhread and odd  are  in new state
	   EvenThread e=new EvenThread();
	   OddThread o=new OddThread();
	   
	//start method calls run method
	   e.start();
	   o.start();
	   //main thread ends
	   System.out.println("MAIN THREAD ENDS");
	   
}
}
   class EvenThread extends Thread{
	   public void run() {
		   try {
			EvenThread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   for(int i=0;i<50;i++) {
		   if(i%2==0)
		   System.out.println(i);
	   }
	   }
   }

   class OddThread extends Thread{
	   public void run() {
	   for(int i=0;i<50;i++) {
		   if(i%2==1)
		   System.out.println(i);
	   }
   }
   }
   
   
