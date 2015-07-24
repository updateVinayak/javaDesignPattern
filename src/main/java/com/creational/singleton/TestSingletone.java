package com.creational.singleton;

public class TestSingletone {

	public static void main(String[] args) {
		
		/*ServiceLocator serviceLocator = ServiceLocator.getInstance();
		
		System.out.println("For the first Object : " +serviceLocator.hashCode() );
		
		
		
		ServiceLocator serviceLocator1 = ServiceLocator.getInstance();
		
		System.out.println("For the second Object : " +serviceLocator1.hashCode() );
		*/
		
		
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();
		
	}
	
}
