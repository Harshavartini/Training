package com.casino;

import java.util.*;

public class DisplayInfo extends CurrencyDetails  {

	CurrencyDetails cd=new CurrencyDetails();
	CalcSalary cs=new CalcSalary();
public void  display(int x) {
	//System.out.println("hi");
	
	switch(x) {
	case 1:{
		//System.out.println(curr);
		
		for(Map.Entry<String,Integer> e: cd.curr.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
			System.out.println();
			
			
		}
		break;
		
	}
		
	case 2:
		for(Map.Entry<Integer,List> e1: cd.player.entrySet()) {
			System.out.println(e1.getKey());
			
			
		}
		break;
		
		
		
	case 3: cs.Calculate();
		
		
	}
}
	
	
}
