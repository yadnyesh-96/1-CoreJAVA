/* final Class
	final class means the class which we decalre them as a using the final keyword 
	final class means the class we cannot be the inherit in another class called as final 
	class. goal of the final class is the create the immutable class and thread safe class
	immutable means we cannot change the object once initialize and object values 
*/

final class Employee{
	private final String name,address;
	private final int id;
	
	public Employee(String name,String address,int id){
		this.name=name;
		this.address=address;
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	
	public int getId(){
		return id;
	}
}
public class EMAPp{
	public static void main(String x[]){
		Employee emp1=new Employee("ABC","ANG",23);
		Employee emp2=emp1;
		
		System.out.println("1- Employee Detail's ");
		System.out.println("Name: "+emp1.getName()+"\nAddress: "+emp1.getAddress()+"\nID: "+emp1.getId());
		
		System.out.println("\n\n2-Employee Detail's");
		System.out.println("Name: "+emp2.getName()+"\nAddress: "+emp2.getAddress()+"\nID: "+emp2.getId());
	
	}
}