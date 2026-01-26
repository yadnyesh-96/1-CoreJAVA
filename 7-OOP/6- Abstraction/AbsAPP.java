abstract class Employee{
	
	abstract void skill();
}

class Developer extends Employee{
	
	void skill(){
		System.out.println("Need A Software developer");
	}	
	}
	class cook extends Employee{
		
		void skill(){
			System.out.println("Required a Good Chief");
	}

}
