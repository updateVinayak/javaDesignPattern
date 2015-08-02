package com.structural.proxy;

public class TestClass {

	public static void main(String[] args) {
		
		ATMProxy atmProxy = new ATMProxy();
		System.out.println(atmProxy.getCashInATMMachine());
		atmProxy.getATMState();
		
	}
	
}
