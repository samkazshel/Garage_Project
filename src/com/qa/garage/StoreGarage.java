package com.qa.garage;

import java.util.ArrayList;

import com.qa.vehicle.Car;
import com.qa.vehicle.Vehicle;

public class StoreGarage {

	ArrayList<Vehicle> Garage = new ArrayList<>();
	
	
	public void addCar(String model, String regPlate, boolean mOT, String engineSize, int seats, int doors) {
	}
	
	public void displayGarage() {
		System.out.println(Garage);
	}
	
	public void calcBill() {
		
	}
}
