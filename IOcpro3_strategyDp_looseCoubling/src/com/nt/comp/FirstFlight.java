package com.nt.comp;

public class FirstFlight implements Courier  {

public FirstFlight() {
System.out.println("FirstFlight.FirstFlight()::0-param constrcutor");
}
@Override

public String  deliver(int oid) {
	System.out.println("dtdc delever");
	return "firstfilgth courier will deliver order id"+oid+"order perducets";
}

	
}
