/*
1. Question:
 Create a base class Employee with fields name and salary. 
 Create subclasses Manager and Developer.
 Manager gets a 20% bonus on salary.

Developer gets a 10% bonus.
 Write a program to calculate and display the total
 salary (base + bonus) for each employee.
 
 Explanation:
 This tests how to use inheritance to share fields/methods and override logic 
 for bonus calculations.

*/

class Employee{
	
	String name;
	double salary;
	
	public Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
}

class Manager extends Employee{
	
		Manager(String name,double salary){
			super(name,salary);
		}
	
	void getMangerSal(){
		
		double bonus=salary*0.20;
		
		System.out.println("Name of Employee :"+name);
		System.out.println("Salary 		 :"+salary);
		System.out.println("Bonus 10% 	 :"+bonus);
		System.out.println("Total Salary 	 :"+(bonus+salary));
		System.out.println("-----------------------------");
	}
}

class Developer extends Employee{
	
		Developer(String name,double salary){
				super(name,salary);
		}
	
	void getDeveloperSal(){
		
		double bonus=salary*0.10;
		
		System.out.println("Name of employee :"+name);
		System.out.println("Salary 		 :"+salary);
		System.out.println("Bonus 20%	 :"+bonus);
		System.out.println("Total Salary	 :"+(salary+bonus));
		System.out.println("-----------------------------");
	}
}

public class EmployeeSalary{
	
	public static void main(String x[]){
		
		Manager m1=new Manager("Yadnyesh",25000);
		m1.getMangerSal();
		
		Developer d1=new Developer("Aniket",35000);
		d1.getDeveloperSal();
		
	}
}