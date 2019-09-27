package com.detouch;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishmsgGeneratorService {
	public String generateWishMessage(String name) {
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12) 			
		     return "GM:"+name;
		if(hour<=16)
		     return "GA:"+name;
		if(hour<=20)
		     return "GE:"+name;
		else
		     return "Morning:"+name;
		
	}
       
}
