package com.qa.garage;

public class Motorbike extends Vehicle{
	public boolean SidecarFitting;
	public boolean ClutchLeverReplacement;
	
	public boolean isSidecarFitting() {
		return SidecarFitting;
	}
	public void setSidecarFitting(boolean sidecarFitting) {
		SidecarFitting = sidecarFitting;
	}
	public boolean isClutchLeverReplacement() {
		return ClutchLeverReplacement;
	}
	public void setClutchLeverReplacement(boolean clutchLeverReplacement) {
		ClutchLeverReplacement = clutchLeverReplacement;
	}
	public Motorbike(String vehicleType, String make, int tyres, int brakePads, int vehicleId, int amountTyres,
			int totalCost, boolean sidecarFitting, boolean clutchLeverReplacement) {
		super(vehicleType, make, tyres, brakePads, vehicleId, amountTyres, totalCost);
		SidecarFitting = sidecarFitting;
		ClutchLeverReplacement = clutchLeverReplacement;
	}
	@Override
	public String toString() {
		return "Motorbike [SidecarFitting=" + SidecarFitting + ", ClutchLeverReplacement=" + ClutchLeverReplacement
				+ ", VehicleType=" + VehicleType + ", Make=" + Make + ", Tyres=" + Tyres + ", BrakePads=" + BrakePads
				+ ", VehicleId=" + VehicleId + ", AmountTyres=" + AmountTyres + ", TotalCost=" + TotalCost + "]";
	}
	
	
	
     
}
