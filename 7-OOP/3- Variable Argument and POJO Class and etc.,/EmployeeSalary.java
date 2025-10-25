/*
Q8. Create a POJO class Employee with the following private fields:
• int id
• String name
• double salary
Then, perform the following operations without using any constructor:
1. Use setter methods to assign values to id, name, and salary.
2. Write a method calculateBonus() that returns a bonus amount based on the employee’s
salary as per the given conditions:
o If salary ≥ 100000 → bonus = 15% of salary
o If salary ≥ 50000 and < 100000 → bonus = 10% of salary
o If salary < 50000 → bonus = 5% of salary
3. Write another method displayEmployeeDetails() that prints:
o Employee ID
o Employee Name
o Salary
o Bonus (calculated using calculateBonus())
o Total Compensation (salary + bonus)
4. In the main method, create an object of Employee,
o set data using setter methods,
o call calculateBonus() and displayEmployeeDetails() to show all employee
information.
*/


import java.util.*;
class Employee{
	
	private int empid;
	private String empname;
	private double empsalary;
	
	void setEmpId(int empid){
		this.empid=empid;
	}
	
	int getEmpId(){
		return empid;
	}
	
	void setEmpName(String empname){
		this.empname=empname;
	}
	
	String getEmpName(){
		return empname;
	}
	
	void setEmpSal(double empsalary){
		this.empsalary=empsalary;
	}
	
	double getEmpSal(){
		return empsalary;
	}
	
	
	/*
	2. Write a method calculateBonus() that returns a bonus amount based on the employee’s
	salary as per the given conditions:
	o If salary ≥ 100000 → bonus = 15% of salary
	o If salary ≥ 50000 and < 100000 → bonus = 10% of salary
	o If salary < 50000 → bonus = 5% of salary
	*/
	
	double calculateBonus(){
		double bonus;
		
		if(empsalary>=100000){
			bonus=empsalary*0.15;
		}else if(empsalary>=50000){
			bonus=empsalary*0.10;
		}else{
			bonus=empsalary*0.05;
		}
		
		return bonus;
	}
	
	/*
	3. Write another method displayEmployeeDetails() that prints:
	o Employee ID
	o Employee Name
	o Salary
	o Bonus (calculated using calculateBonus())
	o Total Compensation (salary + bonus)
	*/
	
	void displayEmployeeDetails(){
		
		double bonus=calculateBonus();
		double Total=empsalary+bonus;
		
		System.out.println("Employee Id        :"+empid
				        +"\nEmployee Name      :"+empname
			         	+"\nSalary             :"+empsalary
						+"\nBonus         	   :"+bonus
						+"\nTotal Compensation :"+Total
						);
	}
	
	
}

public class EmployeeSalary{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the How many Employee :");
		int n=sc.nextInt();
		
		Employee em[]=new Employee[n];
		
		for(int i=0; i<em.length; i++){
				em[i]=new Employee();
				
				em[i].setEmpId(101+i);
				 sc.nextLine();
				System.out.println("Enter the Name of Employee:");
				String name=sc.nextLine();
				em[i].setEmpName(name);
				
				System.out.println("Enter the salary :");
				double sal=sc.nextDouble();
				em[i].setEmpSal(sal);
				
				 
				
		}
		
		for(int i=0; i<em.length; i++){
			System.out.println("--------------------------");
			em[i].displayEmployeeDetails();
			System.out.println("--------------------------");
		}
		
	}	

}