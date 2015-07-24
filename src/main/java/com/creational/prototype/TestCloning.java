package com.creational.prototype;

public class TestCloning {

	
	public static void main(String[] args) {
		
		CloneFactory cloneFactory = new CloneFactory();
		Sheep sally =  new Sheep();
		Sheep sallyCopy = (Sheep)cloneFactory.getClone(sally);
		
		System.out.println("Sally : " + System.identityHashCode(System.identityHashCode(sally)));
		System.out.println("Sally Object : " + System.identityHashCode(System.identityHashCode(sallyCopy)));
	}
}
