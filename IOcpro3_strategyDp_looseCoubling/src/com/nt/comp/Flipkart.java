package com.nt.comp;
import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
//property
private Courier courier;//rule 
public Flipkart() {
System.out.println("Flipkart.Flipkart()::0-param constructor");

}
public Courier getCourier() {
	return courier;
}
public void setCourier(Courier courier) {
	this.courier = courier;
}
 
//b.method
public String shopping(String[]items,float[]prices) { 
	System.out.println("Flipkart.shopping()");
	float billAmt=0.0f;
	int oid=0;
	String msg=null;
	Random rad=null;
	//calculate bill Amount
	for(float p:prices)
		//billAmt=billAmt+p;
		billAmt+=p;
	//generate order id dyaamically as random number
	rad=new Random();
	oid=rad.nextInt(1000);
	//use courier service for deliver
	msg=courier.deliver(oid);
	return Arrays.toString(items)+"are purchased  havig price"+Arrays.toString(prices)+"with bill amount"+billAmt+"--"+msg;
	
}

	
	
}
