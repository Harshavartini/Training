package com.cg.mobshop.util;
import java.util.HashMap;
import java.util.Map;

import com.cq.mobshop.dto.Mobiles;

public class Util{
public static Map<String, Mobiles> mobileEntries=new HashMap<String,Mobiles>();
public static Map<String,Mobiles> getMobileEntries(){
	mobileEntries.put("104", new Mobiles("104", "Sony xperia","12", 12000));
	mobileEntries.put("102", new Mobiles("102", "Samsung Note","4", 10000));
	mobileEntries.put("107", new Mobiles("107", "Iphone 3", "2", 23000));
	mobileEntries.put("101", new Mobiles("101", "Nokia Note 2322"," 8", 15000));	

	return mobileEntries;
}
}
