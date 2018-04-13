package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, Month.APRIL, 15);
		System.out.println(date);
		
		Period p = Period.of(1, 2, 3);
		
		date = date.plus(p);
		System.out.println(date);
	}

}
