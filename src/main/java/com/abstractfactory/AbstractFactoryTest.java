package com.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		CarFactory carfatory = CarFactoryProducer.getCarFactory("Honda");
		carfatory.createCar("Citi").drive();
		

	}

}
