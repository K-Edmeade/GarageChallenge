package com.qa.garage;

public class Vehicle {
	public String VehicleType;
	public String Make;
	public int Tyres;
	public int BrakePads;
	public int VehicleId;
	public int AmountTyres;
	public int TotalCost;

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public int getTyres() {
		return Tyres;
	}

	public void setTyres(int tyres) {
		Tyres = tyres;
	}

	public int getBrakePads() {
		return BrakePads;
	}

	public void setBrakePads(int brakePads) {
		BrakePads = brakePads;
	}

	public int getVehicleId() {
		return VehicleId;
	}

	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}

	public int getAmountTyres() {
		return AmountTyres;
	}

	public void setAmountTyres(int amountTyres) {
		AmountTyres = amountTyres;
	}

	public int getTotalCost() {
		return TotalCost;
	}

	public void setTotalCost(int totalCost) {
		TotalCost = totalCost;
	}

	public Vehicle(String vehicleType, String make, int tyres, int brakePads, int vehicleId, int amountTyres,
			int totalCost) {
		super();
		VehicleType = vehicleType;
		Make = make;
		Tyres = tyres;
		BrakePads = brakePads;
		VehicleId = vehicleId;
		AmountTyres = amountTyres;
		TotalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleType=" + VehicleType + ", Make=" + Make + ", Tyres=" + Tyres + ", BrakePads="
				+ BrakePads + ", VehicleId=" + VehicleId + ", AmountTyres=" + AmountTyres + ", TotalCost=" + TotalCost
				+ "]";
	}

}
