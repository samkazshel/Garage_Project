package com.qa.runner;

import com.qa.garage.StoreGarage;
import com.qa.vehicle.Car;
import com.qa.vehicle.MotorBike;
import com.qa.vehicle.Van;
import com.qa.vehicle.Vehicle;

public class Runner {

	public static void main(String[] args) {
		
		StoreGarage g = new StoreGarage();
		
		//this the way I would like to pass in the methods through the runner class
		//we could also use an input scanner and have values ready to pass into the car, van, or motorbike objects.
		g.addVehicle(new Car("Reno Clio 2007", "REG 1235", false, "3 Cylinder", 5, 3));
		g.addVehicle(new Van("Ford Transit 2013", "Reg 4573", true, "v6", 50.5f, true));
		g.addVehicle(new MotorBike("Yamaha 56", "REG 324", true, "1000cc", "Off Road", "Normal"));
		g.displayGarage();
		g.removeVehicleByReg("REG 1235");
		g.removeVehicleByReg("Reg 4573");
		g.displayGarage();
		g.emptyGarage();
		g.displayGarage();

	}

}
