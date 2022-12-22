package com.capgemini.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneID {

	public static void main(String[] args) {
		LocalTime lt=LocalTime.now(ZoneId.of("America/Toronto"));
		System.out.println(lt);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
