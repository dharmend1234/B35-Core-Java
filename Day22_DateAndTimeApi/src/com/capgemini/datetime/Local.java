package com.capgemini.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Local {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDate d1=LocalDate.of(2023, 01, 28);
		System.out.println(d);
		System.out.println(t);
		System.out.println(dt);
		System.out.println(d1);
	}

}
