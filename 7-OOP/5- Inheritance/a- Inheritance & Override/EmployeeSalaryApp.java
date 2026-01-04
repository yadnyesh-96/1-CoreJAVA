/*
10. Question:
 Create base class Employee with method calculateBonus().
 PermanentEmployee bonus = 25% of salary.

 
 Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/

class Employee{
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	double calculateBonus(){
		return 0;
	}
	
	void display(){
		System.out.println("~~~ Employee Salary details ~~~");
		System.out.println("ID :"+id);
		System.out.println("Name : "+name);
		System.out.println("Salary :"+salary);
		
	}
}

class PermanentEmployee extends Employee{
	
	PermanentEmployee(int id,String name,double salary){
		super(id,name,salary);
	}
	
	double calculateBonus(){
		return salary*0.25;
	}
	
	void display(){
		super.display();
		double bonus=calculateBonus();
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary :"+(bonus+salary));
	}

}

class ContractEmployee extends Employee{
	
	ContractEmployee(int id,String name,double salary){
		super(id,name,salary);
	}

	double calculateBonus(){
		return salary*0.10;
	}
	
	void display(){
		super.display();
		double bonus=calculateBonus();
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary :"+(bonus+salary));
	}
}


public class EmployeeSalaryApp{
	public static void main(String x[]){
		Employee E1=new PermanentEmployee(001,"ABC",15000);
		E1.display();
		
		System.out.println("---------------------------\n");
		E1=new ContractEmployee(002,"XYZ",23000);
		E1.display();
		
	}
}