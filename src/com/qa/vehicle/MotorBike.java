package com.qa.vehicle;

public class MotorBike extends Vehicle{
	
	private String tires;
	private String ridingPosition;
	
	
	public MotorBike(String model, String regPlate, boolean mOT, String engineSize, String tires,
			String ridingPosition) {
		super(model, regPlate, mOT, engineSize);
		this.tires = tires;
		this.ridingPosition = ridingPosition;
	}

	

	public String getTires() {
		return tires;
	}



	public void setTires(String tires) {
		this.tires = tires;
	}



	public String getRidingPosition() {
		return ridingPosition;
	}



	public void setRidingPosition(String ridingPosition) {
		this.ridingPosition = ridingPosition;
	}



	@Override
	public String toString() {
		return "MotorBike [tires=" + tires + ", ridingPosition=" + ridingPosition + ", model=" + model + ", regPlate="
				+ regPlate + ", MOT=" + MOT + ", engineSize=" + engineSize + "]";
	}

	
	
	
	

}
