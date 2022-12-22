package com.capgemini.datetime;

import java.time.Instant;

public class Epoch {

	public static void main(String[] args) {
		Instant I=Instant.EPOCH.now();
		System.out.println(I);
		Instant I1=Instant.EPOCH.MIN;
		System.out.println(I1);
	}

}
