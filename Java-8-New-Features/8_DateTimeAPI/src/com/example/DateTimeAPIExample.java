package com.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*Till Java 7, We used to use Date and Time classes for creating date and time from java.util or java.sql package. Different 
classes provide different format [sql-> Database format, util-> System format] which create confusions.
Java 8 provides a new Date and Time API inside java.time package in a simplier way.*/

public class DateTimeAPIExample {

	public static void main(String[] args) {
		//System readable format
		//Provides both date and time
		//Not human readable format
		//There is no way to get date and time separately
		Date d = new Date();
		System.out.println("Java 7: " + d);
		
		LocalDate date1 = LocalDate.now();	//gives the current system date
		System.out.println("System Date: " + date1);
		
		LocalDate date2 = LocalDate.of(1989, Month.AUGUST, 20);	//gives the particular date
		System.out.println("Particular Date: " + date2);
		
		LocalDate date3 = LocalDate.now(ZoneId.of("America/Chicago")); //gives the date of a particular zone
		System.out.println("Different Zone Date: " + date3);
		
		String formattedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("DD/MM/YYYY"));	//Formatted Date
		System.out.println("Formatted Date: " + formattedDate);
		
		LocalTime time1 = LocalTime.now();//gives the current system time
		System.out.println("System Time: " + time1);
		
		LocalTime time2 = LocalTime.of(10, 15, 31);//gives the particular time
		System.out.println("Particular Time: " + time2);
		
		LocalTime time3 = LocalTime.now(ZoneId.of("America/Chicago"));//gives the time of a particular zone
		System.out.println("Different Zone Time: " + time3);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Java 8: " + dateTime);
		
		//Java 8 System readable Date and Time
		Instant dateTimeInstant = Instant.now();
		System.out.println("Java 8 System Readable Format: " + dateTimeInstant);
		
		LocalDate dateException = LocalDate.of(1989, Month.FEBRUARY, 29);	//Also checks for exception
		System.out.println("Exception check: " + dateException);
	}

}
