
import java.util.*;
class Employee {
	int id;
	int sal;
	String name;
	
	Employee(int id, int sal,String name){
		this.id = id;
		this.sal=sal;
		this.name=name;
	}
	
	void setSal(int sal){
		this.sal=sal;
	}
	
	int getSal(){
		return sal;
	}
	void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return name;
	}
	
	void setId(int id){
		this.id =id;
	}
	
	int getId(){
		return id;
	}
}


public class EmployeeAPP{
	public static void main(String x[]){
		
		List ls =new ArrayList();
		
		ls.add(new Employee(12,1450,"Ajay"));
		ls.add(new Employee(14,1200,"Vijay"));
		ls.add(new Employee(13,1600,"Vikrant"));
		ls.add(new Employee(11,1100,"Suresh"));
		
		
		Iterator i = ls.listIterator();
		
		while(i.hasNext()){
			Employee e = i.next();
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		}
	}
}