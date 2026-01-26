abstract class Employee{
	
	abstract void skill();
}

class Developer extends Employee{
	
	

}

public class AbsAPP{
	
	public static void main(String x[]){
		
		Developer d=new Developer();
		d.skill();
		
		cook c=new cook();
		c.skill();
	}
}