package com.structural.proxy;

public class ATMProxy implements GetATMData{

	public void getATMState() {
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.getATMState();
		
	}

	public int getCashInATMMachine() {
		ATMMachine atmMachine = new ATMMachine();
		return atmMachine.getCashInATMMachine();
		
	}

	
	
}
