package com.creational.singleton;

public class MyThread implements Runnable {

	public void run() {
		
		ServiceLocator serviceLocator = ServiceLocator.getInstance();
		
		System.out.println(serviceLocator.hashCode());
	}
	
	

}
