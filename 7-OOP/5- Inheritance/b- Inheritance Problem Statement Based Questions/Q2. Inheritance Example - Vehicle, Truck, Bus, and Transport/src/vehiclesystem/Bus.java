package vehiclesystem;

public class Bus extends Vehicle {
	
	private int numberOfPassengers; 
	Bus(String model,String registrationNumber,double speed,double fuelcapacity,double fuelconsumption,int numberOfPassengers){
		super(model,registrationNumber,speed,fuelcapacity,fuelconsumption);
		this.numberOfPassengers=numberOfPassengers;
	}
	
	public int getNumberOfPassengers() { return numberOfPassengers; }
	public void setNumberOfPassenegers(int numberOfPassengers) { this.numberOfPassengers=numberOfPassengers;	}
	
	void display() {
		super.display();
		System.out.println("Number of Passangers :"+numberOfPassengers);
	}
}
