package com.imaginology.ums.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		
	
	String date_s = " 2011-01-18 00:00:00.0"; 
	SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
	Date date = null;
	try {
		date = dt.parse(date_s);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	System.out.println(dt1.format(date));
	

}
}