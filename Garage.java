package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Vehicle> VehiclesInGarage = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.VehiclesInGarage.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		this.VehiclesInGarage.remove(vehicle);
	}

	public void removeVehicleById(int vehicleId) {
		List<Vehicle> remove = new ArrayList<Vehicle>();
		for (Vehicle v : VehiclesInGarage) {
			if (v.getVehicleId() == vehicleId) {
				remove.add(v);
			}

		}
		for (Vehicle v : remove) {
			VehiclesInGarage.remove(v);
		}

	}

	public void removeVehicleByType(String vehicleType) {
		List<Vehicle> remove = new ArrayList<Vehicle>();
		for (Vehicle v : VehiclesInGarage) {
			if (v.getVehicleType().equalsIgnoreCase(vehicleType)) {
				remove.add(v);
			}

		}
		for (Vehicle v : remove) {
			VehiclesInGarage.remove(v);
		}

	}

	public void removeAllVehicle() {
		List<Vehicle> removeAll = new ArrayList<Vehicle>();
		for (Vehicle v : VehiclesInGarage) {
			if (v.getVehicleId() >= 0) {
				removeAll.add(v);
			}
		}
		for (Vehicle v : removeAll) {
			VehiclesInGarage.remove(v);
		}

	}

	public void addMotorbike(Motorbike bike) {
		this.VehiclesInGarage.add(bike);
	}

	public void removeMotorbike(Motorbike bike) {
		this.VehiclesInGarage.remove(bike);
	}

	public void addCar(Car car) {
		this.VehiclesInGarage.add(car);
	}

	public void removeCar(Car car) {
		this.VehiclesInGarage.remove(car);
	}

	public void addTruck(Truck truck) {
		this.VehiclesInGarage.add(truck);
	}

	public void removeTruck(Truck truck) {
		this.VehiclesInGarage.remove(truck);
	}

	public void printAll() {
		for (Vehicle v : VehiclesInGarage) {
			System.out.println(v);
		}
	}

	public void clearAll() {
		VehiclesInGarage.clear();
		
	}

}
