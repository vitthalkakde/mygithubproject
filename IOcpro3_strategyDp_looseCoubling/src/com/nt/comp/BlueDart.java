package com.nt.comp;

public class BlueDart implements Courier {
	
	public BlueDart() {
	
	System.out.println("BlueDart::0-param constrcutorBlueDart()");
	}
	
@Override
public String deliver(int oid) {
	System.out.println("BlueDart.deliver()");
	
	return"BlueDart Courier will deliver id"+oid+"order products";
}
}
