package com.cg.mobshop.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.mobshop.dao.MobileDAO;
import com.cg.mobshop.dao.MobileDAOImpl;
import com.cq.mobshop.dto.Mobiles;

public class MobileServiceImpl implements MobileSerice {

	MobileDAO mdal=new MobileDAOImpl();
	
	@Override
	public List<Mobiles> getMobileList() {
		// TODO Auto-generated method stub
		List<Mobiles> l1=new ArrayList<Mobiles>(mdal.getMobileList().values());
		return  l1;
	}

	@Override
	public List<Mobiles> deleteMobile(String x) {
		// TODO Auto-generated method stub
		List<Mobiles> l2=new ArrayList<Mobiles>(mdal.deleteMobile(x).values());
		return  l2;
	}

	@Override
	public List SortList(int x) {
	   // TODO Auto-generated method stub
		List<Mobiles> l3=new ArrayList<Mobiles>(mdal.SortList(x));
		return  l3;
		
	}

	
}
