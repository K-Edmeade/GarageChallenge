package com.qa.garage;

public class Truck extends Vehicle {

	public int CoolingHoseReplacement;
	public boolean CabValet;

	public int getCoolingHoseReplacement() {
		return CoolingHoseReplacement;
	}

	public void setCoolingHoseReplacement(int coolingHoseReplacement) {
		CoolingHoseReplacement = coolingHoseReplacement;
	}

	public boolean isCabValet() {
		return CabValet;
	}

	public void setCabValet(boolean cabValet) {
		CabValet = cabValet;
	}

	public Truck(String vehicleType, String make, int tyres, int brakePads, int vehicleId, int amountTyres,
			int totalCost, int coolingHoseReplacement, boolean cabValet) {
		super(vehicleType, make, tyres, brakePads, vehicleId, amountTyres, totalCost);
		CoolingHoseReplacement = coolingHoseReplacement;
		CabValet = cabValet;
	}

}
