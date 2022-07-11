package com.qa.garage;

public class Runner {
	public static void main(String[] args) {

		Garage VehiclesInTheGarage = new Garage();

		Vehicle vehicleOne = new Vehicle("car", "jag", 4, 4, 1, 4, 400);
		Vehicle vehicleTwo = new Vehicle("car", "benz", 4, 4, 2, 4, 400);
		Vehicle vehicleThree = new Vehicle("truck", "ford", 4, 3, 3, 4, 400);
		Vehicle vehicleFour = new Vehicle("motorbike", "bmw", 4, 4, 4, 4, 400);

		VehiclesInTheGarage.addVehicle(vehicleOne);
		VehiclesInTheGarage.addVehicle(vehicleTwo);
		VehiclesInTheGarage.addVehicle(vehicleThree);
		VehiclesInTheGarage.addVehicle(vehicleFour);

		// VehiclesInTheGarage.removeVehicleById(3);
		// VehiclesInTheGarage.removeVehicleByType("Car");
		// VehiclesInTheGarage.clearAll();

		VehiclesInTheGarage.printAll();
	}
}
