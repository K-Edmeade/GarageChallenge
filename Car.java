package com.qa.garage;

public class Car extends Vehicle {

	public int SteeringWheelReplacement;
	public int SatNavCost;

	public int getSteeringWheelReplacement() {
		return SteeringWheelReplacement;
	}

	public void setSteeringWheelReplacement(int steeringWheelReplacement) {
		SteeringWheelReplacement = steeringWheelReplacement;
	}

	public int getSatNavCost() {
		return SatNavCost;
	}

	public void setSatNavCost(int satNavCost) {
		SatNavCost = satNavCost;
	}

	public Car(String vehicleType, String make, int tyres, int brakePads, int vehicleId, int amountTyres, int totalCost,
			int steeringWheelReplacement, int satNavCost) {
		super(vehicleType, make, tyres, brakePads, vehicleId, amountTyres, totalCost);
		SteeringWheelReplacement = steeringWheelReplacement;
		SatNavCost = satNavCost;
	}

}
