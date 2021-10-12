package com.qa.vehicle;

public class Vehicle {

	public String model;
	public String regPlate;
	public boolean MOT;
	public String engineSize;
	
	

	public Vehicle(String model, String regPlate, boolean mOT, String engineSize) {
		super();
		this.model = model;
		this.regPlate = regPlate;
		MOT = mOT;
		this.engineSize = engineSize;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getRegPlate() {
		return regPlate;
	}



	public void setRegPlate(String regPlate) {
		this.regPlate = regPlate;
	}



	public boolean isMOT() {
		return MOT;
	}



	public void setMOT(boolean mOT) {
		MOT = mOT;
	}



	public String getEngineSize() {
		return engineSize;
	}



	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	
	
	
	
}
