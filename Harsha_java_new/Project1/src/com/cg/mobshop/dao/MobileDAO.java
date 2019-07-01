package com.cg.mobshop.dao;

import java.util.List;
import java.util.Map;

import com.cq.mobshop.dto.Mobiles;

public interface MobileDAO {
    
//	public   Map<Integer,Mobiles> getMobileList() {
//		// TODO Auto-generated method stub
//		return MobileDAOImpl.getMobileList();
//	}
//	public  Mobiles deleteMobile(int mobcode) {
//		// TODO Auto-generated method stub
//		return MobileDAOImpl.deleteMobile(mobcode);
//	}
//	public List<Mobiles> SortList(String criteria) {
//		// TODO Auto-generated method stub
//		return MobileDAOImpl.SortList(criteria);
//	}
	
	public  Map<String,Mobiles> getMobileList();
	public Map<String,Mobiles> deleteMobile(String x);
	public List SortList(int criteria);

}
