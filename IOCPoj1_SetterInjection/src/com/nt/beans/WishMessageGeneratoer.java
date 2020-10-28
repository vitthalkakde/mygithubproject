package com.nt.beans;

import java.util.Date;

public class WishMessageGeneratoer {

//beans  prorerty
	private Date date;


	public void setDate(Date date) {
		this.date = date;
	}
	
	public String genarateWishMassage(String user) {
		int hour=0;
		//get cuurent hour of the day
		hour=date.getHours();
		//generate wish massage (b.logic)
		if(hour<12)
			return "Good morning::"+user;
		
		else if(hour<16)
			return "GOod Afternoon::"+user;
		else if(hour<20)
			return "Good Evening ::"+user;
		else
			return "GoD Nigth::"+user;
		
		
		
	}

	

	


	
}
