package com.creational.singleton;

public class ServiceLocator {

	public static ServiceLocator serviceLocator;
	
	private ServiceLocator(){
		
		System.out.println("Creating the Object of Service locator");
		
	}
	
	
	public static ServiceLocator getInstance(){
		
		synchronized (ServiceLocator.class) {
			if(serviceLocator == null){
				serviceLocator =  new ServiceLocator();
			}
		}
		
		return serviceLocator;
	}
	
	
}
