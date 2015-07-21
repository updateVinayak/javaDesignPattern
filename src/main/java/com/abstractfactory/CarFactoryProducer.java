package com.abstractfactory;

public class CarFactoryProducer {
	
	public static CarFactory getCarFactory(String factoryType){
		
		if("Honda".equalsIgnoreCase(factoryType)){
			return new HondaCarFactory();
		}
		else if("Hyndai".equalsIgnoreCase(factoryType)){
			return new HyndaiCarFactory();
		}
		return null;
	}

}
