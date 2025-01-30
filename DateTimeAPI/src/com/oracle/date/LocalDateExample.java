package com.oracle.date;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;



public class LocalDateExample    {

	public static void main(String[] args) {


		LocalDate  date =	  LocalDate.now();
		
			System.out.println(date);
			
		LocalDate  dob =	  LocalDate.of(1947, 8, 15);
		
			System.out.println(dob);
			
			//getXX();
			
			System.out.println("Year "+date.getYear());
			System.out.println("Day of Week "+ date.getDayOfWeek());
			System.out.println("Is This  Leap Year? "+date.isLeapYear());
			System.out.println("Add 1 month "+date.plusMonths(1));
			System.out.println("Sub 1 year "+date.minusYears(1));
			
			System.out.println("Todays date is after dob "+date.isBefore(dob));
			
		
			    LocalTime time =        LocalTime.now();
			
			    	System.out.println(time.getHour() +" "+ time.getMinute() );
			    	
			    	
			   LocalDateTime  dateTime =  LocalDateTime.now(); 
			   
			   
			   	System.out.println(dateTime.getYear());
			   	System.out.println(dateTime.getHour());
			   	
			   	System.out.println(dateTime.withDayOfYear(99));
			   	
			   	
			   	System.out.println(dob.withDayOfYear(100));

	}

}
