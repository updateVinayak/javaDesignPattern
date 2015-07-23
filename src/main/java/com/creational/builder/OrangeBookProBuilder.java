package com.creational.builder;

public class OrangeBookProBuilder implements ComputerBuilder{

	private OrangeBookPro orange;
	
	public OrangeBookProBuilder(){
		this.orange = new OrangeBookPro();
	}
	
	public void buildComputerMemory() {
		
		this.orange.setMemory("MacBookPro Memmry");		
	}

	public void buildComputerProcessor() {		
		this.orange.setProcesor("MacBookPro Processor");		
	}

	public void buildComputerHarddisk() {
		this.orange.setHardDisk("MacBookPro HardDisk");		
	}

	public Orange getOrangeComputer() {
		
		return this.orange;
	}

}
