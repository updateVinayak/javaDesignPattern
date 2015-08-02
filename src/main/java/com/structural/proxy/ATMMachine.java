package com.structural.proxy;

public class ATMMachine implements GetATMData{

	public void getATMState() {
		System.out.println("State original");
		
	}

	public int getCashInATMMachine() {
		System.out.println("Cash original");
		return 100;
	}

}
