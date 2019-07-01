package com.casino;
import java.util.*;


public class PlayerDetails extends CurrencyDetails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayInfo d=new DisplayInfo();
		int ctr=100,i;
		List<Integer> list=new ArrayList<Integer>();
	 
		for(i=0;i<12;i++,ctr+=100) {
			list.add(ctr);
		}
			
		ctr=0;
		
		for(i=1;i<=4;i++) {
			player.put(i,list.subList(ctr, ctr+3));
			ctr=ctr+3;
		}
		
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter choice");
	System.out.println("1.Currency and 2.Customer_id and 3.CalculateSalaary");
	int choice=in.nextInt();
	d.display(choice);
	
	
	
	
	
			
			
			
			
		
		
	
//		System.out.println(player);
		
		
		
		
		

	}
	
	

}
    
