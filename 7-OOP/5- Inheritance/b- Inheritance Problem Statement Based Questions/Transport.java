
class Vehicle {
	
 String model,registrationNumber;
 double speed,fuelCapacity,fuelConsumption;
 
 Vehicle(String model, String registrationNumber, double speed,double,double fuelCapacity,double fuelConsumption){
	this.model=model;
	this.registrationNumber=registrationNumber;
	this.speed=speed;
	this.fuelCapacity=fuelCapacity;
	this.fuelConsumption=fuelConsumption;
	}
	
	
	String getModel(){
		return model;
	}
	
	void setModel(String model){
		this.model=model;
	}
	
	String getRegNumber(){
		return registrationNumber;
	}
	
	void setRegNumber(String registrationNumber){
		this.registrationNumber=registrationNumber;
	}
	
	double getSpeed(){
		return speed;
	}
	
	void setSpeed(double speed){
		this.speed=speed;
	}

	double setFuelCapacity(){
		return fuelCapacity;
	}	
	
	void getFuelCapacity(double fuelCapacity){
		this.fuelCapacity=fuelCapacity;
	}
	
	double getFuelConsumption(){
		return fuelConsumption;
	}
	
	void setFuelConsumption(double fuelConsumption){
		this.fuelConsumption;
	}
} 

class Bus extedns Vehicle{

}

class Truck extedns Vehicle{

}

public class Transport {
	
	public static void main(String x[]){
		
		
	}
}