package com.cg.mobshop.service;

import java.util.List;

import com.cq.mobshop.dto.Mobiles;

public interface MobileSerice {
     

	public List<Mobiles> getMobileList();
	public List<Mobiles> deleteMobile(String mobcode);
	public List SortList(int criteria);

	
}
