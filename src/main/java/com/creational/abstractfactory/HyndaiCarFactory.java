package com.creational.abstractfactory;

public class HyndaiCarFactory implements CarFactory {

	
	public Car createCar(String carname) {
		
		if("i10".equalsIgnoreCase(carname)){
			return new I10Car();
		}
		else if("i20".equalsIgnoreCase(carname)){
			return new I20Car();
		}
		
		return null;
	}

}
