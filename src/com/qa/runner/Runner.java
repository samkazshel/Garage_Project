package com.qa.runner;

import com.qa.garage.StoreGarage;

public class Runner {

	public static void main(String[] args) {
		
		StoreGarage g = new StoreGarage();
		
		g.addVehicle();
		g.displayGarage();

	}

}
