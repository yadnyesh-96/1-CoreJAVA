abstract class Employee{
	
	abstract void skill();
}

// class Developer extends Employee{
	
	void skill(){
		System.out.println("Need A Software developer");
	}	
	}
	class cook extends Employee{
		
		void skill(){
			System.out.println("Required a Good Chief");
	}

}

public class AbsAPP{
	
	public static void main(String x[]){
		
		Developer d=new Developer();
		d.skill();
		
		cook c=new cook();
		c.skill();
	}
}