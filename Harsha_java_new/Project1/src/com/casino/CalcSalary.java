package com.casino;
import java.util.*;

public class CalcSalary extends PlayerDetails  {
   
	CurrencyDetails cd1=new CurrencyDetails();
	 
		public  void Calculate() {
			
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter the employee's account num ");
			int n=in.nextInt();
			
			System.out.println("Enter the currency format");
			in.nextLine();
			String currformat=in.nextLine();
			int sum = 0;
			for(int i=0;i<cd1.player.get(n).size();i++)
				sum=sum+(int)cd1.player.get(n).get(i);
			
			int result=sum*cd1.curr.get(currformat);
			System.out.println(result);
			
			
			
			
			
			
			
			
			
		}
		
	
}
