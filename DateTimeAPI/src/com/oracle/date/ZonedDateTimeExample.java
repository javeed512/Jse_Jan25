package com.oracle.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {


		ZonedDateTime  zoneDT =		ZonedDateTime.now();
		
		System.out.println("India Time "+zoneDT);

		ZonedDateTime  zoneDT2 =		ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
					System.out.println("Paris Time "+zoneDT2);
	}

}
