package com.creational.builder;

public class OrangeBookPro implements Orange {

	private String memory;
	
	private String hardDisk;
	
	private String procesor;
	
	
	public String getMemory() {
		return memory;
	}



	public String getHardDisk() {
		return hardDisk;
	}



	public String getProcesor() {
		return procesor;
	}



	public void setMemory(String memory) {
		this.memory = memory;
		
	}

	
	
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
		
	}

	public void setProcesor(String processor) {
		this.procesor = processor;
		
	}

	
	
}
