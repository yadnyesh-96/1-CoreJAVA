import java.util.*;
class Employee{
	
	private int id;
	private String name;
	private double salary;
	
	void setId(int id){
	this.id=id;
	}
	
	int getId(){
	return id;
	}
	
	void setName(String name){
	this.name=name;
	}
	
	String getName(){
	return name;
	}
	
	void setSalary(double salary){
	this.salary=salary;
	}
	
	double getSalary(){
	return salary;
	}
	
	void DisplayEmployee(){
       
            System.out.println("ID: " + id +
                    " | Name: " + name +
                    " | Salary: " + salary );
        
	}
	
}

public class EmployeeDisplay{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	Employee[] em=new Employee[3];
	
	for(int i=0; i<em.length; i++){
		em[i]=new Employee();
		
		em[i].setId(i+1);
		
		System.out.println("Enter the Name:");
		String nm=sc.nextLine();
		em[i].setName(nm);
		
		System.out.println("Enter the Salary:");
		double sal=sc.nextDouble();
		em[i].setSalary(sal);
		
		sc.nextLine();
	}
	
	
	for(int k=0; k<em.length; k++){
		for(int j=k+1; j<em.length; j++){
			if(em[k].getSalary()>em[j].getSalary()){
				Employee e = em[k];
				em[k] = em[j];
				em[j] = e;
				
			}
		}
	}
	System.out.println("\nEmployees Sorted by Salary (Ascending):");
	for(Employee V:em){	V.DisplayEmployee();}
	
	
	System.out.print("----------------");
	
	EmployeeFunctionalit Em1=new EmployeeFunctionalit();
	
	Em1.Display(em);
}
}


class EmployeeFunctionalit{
		
	//Employee E1;
	
	void Display(Employee[] E1){
		
		for(int i=0; i<E1.length; i++){
			System.out.println(E1[i].getName());
		}
	}
}