package com.abstractfactory;

public class HondaCarFactory implements CarFactory {

	
	public Car createCar(String carname) {
		
		if("Citi".equalsIgnoreCase(carname)){
			return new CitiCar();
		}
		else if("brio".equalsIgnoreCase(carname)){
			return new BrioCar();
		}
		return null;
	}

}
