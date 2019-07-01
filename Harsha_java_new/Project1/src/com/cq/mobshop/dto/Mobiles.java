package com.cq.mobshop.dto;

public class Mobiles {
     

private String mobileId;
private String name;
private String price;
private int quantity;
public Mobiles(String i, String string,String j, int k) {
	// TODO Auto-generated constructor stub
	
	setMobileId(i);
	setName(string);
	setPrice(j);
	setQuantity(k);
	
}
public String getMobileId() {
	return mobileId;
}
public void setMobileId(String mobileId) {
	this.mobileId = mobileId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return " \n MobileId=" + mobileId + ", Name=" + name + ", Price=" + price + ", Quantity=" + quantity ;
}

	
	
}
