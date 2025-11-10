package vehiclesystem;

public class Vehicle {

	private String model,registrationNumber;

	private double speed, fuelcapacity,fuelconsumption;
	
	Vehicle(String model,String registrationNumber,double speed,double fuelcapacity,double fuelconsumption){
		this.model=model;
		this.registrationNumber=registrationNumber;
		this.speed=speed;
		this.fuelcapacity=fuelcapacity;
		this.fuelconsumption=fuelconsumption;
	}
	
	public String getModel() { return model; }

	public void setModel(String model) { this.model = model;	}

	public String getRegistrationNumber() { return registrationNumber; }

	public void setRegistrationNumber(String registrationNumber) {	this.registrationNumber = registrationNumber; }

	public double getSpeed() { return speed; }

	public void setSpeed(double speed) { this.speed = speed; }

	public double getFuelcapacity() { return fuelcapacity; }

	public void setFuelcapacity(double fuelcapacity) { this.fuelcapacity = fuelcapacity; }

	public double getFuelconsumption() {return fuelconsumption;}

	public void setFuelconsumption(double fuelconsumption) { this.fuelconsumption = fuelconsumption; }
	
	//Calculates and returns the amount of fuel required for that distance.
	double fuelNeeded(double distance) {
		return distance/fuelconsumption;
	}
	
	//Calculates and returns the distance covered based on the vehicle’s speed. Accepts time (in hours) 
	double distanceCovered(double time) {
		return speed*time;
	}
	
	// Display the Vehicles details 
	void display() {
		System.out.println("~~~~~ Vehicle Details ~~~~~");
		System.out.println("Model :"+model);
		System.out.println("Registration No. :"+registrationNumber);
		System.out.println("Speed  :"+speed+ "km/h");
		System.out.println("Fuel capacity :"+fuelcapacity+" litres");
		System.out.println("Fuel Consumption :"+fuelconsumption+ "km/letre");
	}
	
}
