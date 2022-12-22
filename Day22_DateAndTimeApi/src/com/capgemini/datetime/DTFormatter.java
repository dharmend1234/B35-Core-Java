package com.capgemini.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DTFormatter {

	public static void main(String[] args) {
		String x="2022-01-28 15:56";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l=LocalDateTime.parse(x,dtf);
		LocalDateTime l1=LocalDateTime.now();
		String xx=l1.format(dtf);
		System.out.println(l);
		System.out.println(xx);

	}

}
