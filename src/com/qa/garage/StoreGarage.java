package com.qa.garage;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.qa.vehicle.Car;
import com.qa.vehicle.MotorBike;
import com.qa.vehicle.Van;
import com.qa.vehicle.Vehicle;

public class StoreGarage {

	ArrayList<Vehicle> Garage = new ArrayList<>();
	
	
	public void addVehicle() {
		Car Reno2007 = new Car("Reno Clio 2007", "REG 1235", false, "3 Cylinder", 5, 3);
		Van FordTransit2013 = new Van("Ford Transit 2013", "Reg 4573", true, "v6", 50.5f, true);
		MotorBike Yamaha56 = new MotorBike("Yamaha 56", "REG 324", true, "1000cc", "Off Road", "Normal");
		Garage.add(Reno2007);
		Garage.add(FordTransit2013);
		Garage.add(Yamaha56);
	}
	
	public void displayGarage() {
		System.out.println(Garage);
	}
	
	public void removeVehicleByReg(String reg) {
		Predicate<Vehicle> condition = Vehicle -> Vehicle.getRegPlate() == reg;
		Garage.removeIf(condition);
		
	}
	
	public void fixVehicle() {
		
	}
	
	public void emptyGarage() {
		Garage.removeAll(Garage);
	}
	
	public void calcBill() {
		
	}
}
