package vehiclesystem;

public class TransportSystemTB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Truck T1=new Truck("Volvo-TX12","MH12TR1234",75,150,5,12000);

		//to calculate fuel needed & distance covered
		double truckFuel=T1.fuelNeeded(500);
		double truckDistance=T1.distanceCovered(5);
		T1.display();	
		System.out.println("Fuel Needed for 500 km: " + truckFuel + " litres");
	    System.out.println("Distance Covered in 5 hours: " + truckDistance + " km");
		
	    
	    
	    System.out.println("\n \n");
	    
		Bus B1=new Bus("Tata-star","MH14BS5678",90,80,6,50);
		double busFuel=B1.fuelNeeded(500);
		double busDistance=B1.distanceCovered(5);
		B1.display();
		
	    System.out.println("Fuel Needed for 500 km: " + busFuel + " litres");
	    System.out.println("Distance Covered in 5 hours: " + busDistance + " km");
	}

}
