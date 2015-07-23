package com.creational.builder;

public class ComputerManager {

	private OrangeBookProBuilder orangeBookProBuilder;
	
	public ComputerManager(OrangeBookProBuilder orangeBookProBuilder){
		this.orangeBookProBuilder = orangeBookProBuilder;
	}
	
	
	public void createOrangeBookPro(){
		this.orangeBookProBuilder.buildComputerHarddisk();
		this.orangeBookProBuilder.buildComputerProcessor();;
		this.orangeBookProBuilder.buildComputerMemory();;
	}
	
	
	public OrangeBookPro getOrange(){
		return (OrangeBookPro)this.orangeBookProBuilder.getOrangeComputer();
	}
	
	
	
	
}
