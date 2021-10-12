package com.qa.vehicle;

public class Van extends Vehicle{

	private float storageSpace;
	private boolean roofRack;
	
	public Van(String regPlate, boolean mOT, String engineSize, float storageSpace, boolean roofRack) {
		super(regPlate, mOT, engineSize);
		this.storageSpace = storageSpace;
		this.roofRack = roofRack;
	}

	public float getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(float storageSpace) {
		this.storageSpace = storageSpace;
	}

	public boolean isRoofRack() {
		return roofRack;
	}

	public void setRoofRack(boolean roofRack) {
		this.roofRack = roofRack;
	}

	@Override
	public String toString() {
		return "Van [storageSpace=" + storageSpace + ", roofRack=" + roofRack + ", regPlate=" + regPlate + ", MOT="
				+ MOT + ", engineSize=" + engineSize + "]";
	}
	
	
}
