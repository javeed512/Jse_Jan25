package com.oracle.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatDemo {

	public static void main(String[] args) {


	DateTimeFormatter   format1 =	DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
	
				LocalDate  date =  LocalDate.now();
				
				
				System.out.println(date.format(format1));
				
				DateTimeFormatter   myFormat =	DateTimeFormatter.ofPattern("MM-dd-yyyy");
				
				String  str = "01-31-1990";
				

				LocalDate mydob =		LocalDate.parse(str,myFormat);
				
				System.out.println(mydob.format(format1));
				
	}

}
