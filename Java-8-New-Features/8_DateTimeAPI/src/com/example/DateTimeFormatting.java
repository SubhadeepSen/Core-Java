package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatting {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(10, 20, 30);
		System.out.println(date + "\t" + time);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(dateTime.format(formatter));
		
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("DD-MM-YYYY")));
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("hh:mm")));
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		System.out.println(LocalDate.parse("05 20 1992", f));
		System.out.println(LocalTime.parse("11:20"));

	}

}
