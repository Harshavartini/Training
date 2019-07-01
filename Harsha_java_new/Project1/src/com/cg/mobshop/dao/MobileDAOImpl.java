package com.cg.mobshop.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.cg.mobshop.util.Util;
import com.cq.mobshop.dto.Mobiles;

public class MobileDAOImpl implements MobileDAO{

	
	public Map<String,Mobiles> getMobileList() {
		// TODO Auto-generated method stub
		
//		List<Mobiles> l1=new ArrayList<Mobiles>(Util.mobileEntries.values());
		
		return  Util.getMobileEntries(); 
	}

	public Map<String,Mobiles> deleteMobile(String x) {
		// TODO Auto-generated method stub
		
		 Util.mobileEntries.remove(x);
		// System.out.println();
		return   Util.mobileEntries;
	}

   public List SortList(int x) {
		// TODO Auto-generated method stub
	   List list1=new ArrayList<>();
	   
		switch(x) {
		case 1:{
			
			 list1 = 
		               new LinkedList(Util.mobileEntries.entrySet()); 
			
			Collections.sort(list1, new Comparator<Map.Entry<String, Mobiles> >() { 
		        public int compare(Map.Entry<String, Mobiles> o1,  
		                           Map.Entry<String, Mobiles> o2) 
		        { 
		            return (o1.getValue().getName()).compareTo(o2.getValue().getName()); 
		        } 
		    }); 
			
			

		}break;
		
		case 2:{
			list1 = 
		               new LinkedList(Util.mobileEntries.entrySet()); 
			
			Collections.sort(list1, new Comparator<Map.Entry<String, Mobiles> >() { 
		        public int compare(Map.Entry<String, Mobiles> o1,  
		                           Map.Entry<String, Mobiles> o2) 
		        { 
		            return ((Integer)o1.getValue().getQuantity()).compareTo((Integer)o2.getValue().getQuantity()); 
		        } 
		    }); 
			
			
			
			
			
		}break;
		case 3:{
			TreeMap<String, Mobiles> sorted = new TreeMap<String,Mobiles>(Util.mobileEntries);
		    list1=new ArrayList<Mobiles>(sorted.values());
			
		}
			
		
			
		}

	   
	  return list1;
	  


		
	}

	
	
	
}
