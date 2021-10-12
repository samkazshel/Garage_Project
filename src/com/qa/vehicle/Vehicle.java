package com.qa.vehicle;

public class Vehicle {

	public String regPlate;
	public boolean MOT;
	public String engineSize;
	
	public Vehicle(String regPlate, boolean mOT, String engineSize) {
		super();
		this.regPlate = regPlate;
		MOT = mOT;
		this.engineSize = engineSize;
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
