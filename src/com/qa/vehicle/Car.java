package com.qa.vehicle;

public class Car extends Vehicle{

	private int seats;
	private int doors;
	
	

	public Car(String model, String regPlate, boolean mOT, String engineSize, int seats, int doors) {
		super(model, regPlate, mOT, engineSize);
		this.seats = seats;
		this.doors = doors;
	}

	

	public int getSeats() {
		return seats;
	}



	public void setSeats(int seats) {
		this.seats = seats;
	}



	public int getDoors() {
		return doors;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	@Override
	public String toString() {
		return "Car [seats=" + seats + ", doors=" + doors + ", model=" + model + ", regPlate=" + regPlate + ", MOT="
				+ MOT + ", engineSize=" + engineSize + "]";
	}



	
	
	

}
