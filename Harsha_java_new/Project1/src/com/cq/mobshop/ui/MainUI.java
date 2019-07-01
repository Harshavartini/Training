package com.cq.mobshop.ui;

import java.util.Scanner;

import com.cg.mobshop.service.MobileSerice;
import com.cg.mobshop.service.MobileServiceImpl;

public class MainUI {
 
	public static void main(String[] args) {
		
		MobileSerice ms=new MobileServiceImpl();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Welcome to Mobile World:\nList Of Mobiles");
		System.out.println(ms.getMobileList());
		System.out.println("\n1.Sorting 2.Delete");
		int choice1=in.nextInt();
		int choice2;
		 String choice3;
		switch(choice1) {
		
		case 1:{System.out.println("Select sorting criteria");
			System.out.println("1.	Mobile Name \n2.	Mobile Quantity \n3.	Mobile Id");
			System.out.println("Enter Option:");
		       choice2=in.nextInt();
		       //ms.SortList(choice2);
		       System.out.println(ms.SortList(choice2).toString());
//		       switch(choice2) {
//		       case 1:{
//		    	   ms.SortList(criteria)
//		    	   
//		       }
//		       break;
//		       
//		       case 2:{
//		    	   
//		       }
//		       break;
//		       
//		       case 3:{
//		    	   
//		       }
//		       break;
//		    	   
//		       
//		       }
		      
		      }
        break;
		
		case 2:{System.out.println("Enter the id to b deleted");
		
		        choice3=in.next();
		        ms.deleteMobile(choice3);
		        System.out.println(ms.deleteMobile(choice3).toString());
		
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
