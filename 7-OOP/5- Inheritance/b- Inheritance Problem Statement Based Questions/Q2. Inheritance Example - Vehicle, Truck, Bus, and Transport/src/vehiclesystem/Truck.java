package vehiclesystem;

public class Truck extends Vehicle {
	private double cargoWeightLimit; //Cargo carrying capacity in kilograms.
	
	// Parameterized constructor 
	Truck(String model,String registrationNumber,double speed,double fuelcapacity,double fuelconsumption,double cargoWeightLimit){
		super(model,registrationNumber,speed,fuelcapacity,fuelconsumption);
		this.cargoWeightLimit=cargoWeightLimit;
	}
	
	public double getCargoWeightLimit() { return cargoWeightLimit; }
	public void setCargoWeightLimit(double cargoWeightLimit) { this.cargoWeightLimit=cargoWeightLimit; }
	
	void display() {
		super.display();
		System.out.println("Cargo Weight Limit :"+cargoWeightLimit);
	}
}
