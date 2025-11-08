/*
5. Question:
 Create a base class Staff with a method incrementSalary().
 For TeachingStaff, salary increases by 15%.

 For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.

Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
*/

class Staff{
	
	String name;
	double salary;
	
}

class TechingStaff extends Staff{
	
	void incrementSalary(){
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("Salary increment by 15% :"+((salary*0.15)+salary));
	}
}

class NonTechingStaff extends Staff{
		
	 
	void incrementSalary(){
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("Salary increment by 10% :"+((salary*0.10)+salary));
	}
}

public class SalarySlipApp{
	public static void main(String x[]){
		
		TechingStaff t1=new TechingStaff();
		t1.name="ABC";
		t1.salary=1000;
		t1.incrementSalary();
		
		System.out.println("---------------------------");
		
		NonTechingStaff nt1=new NonTechingStaff();
		nt1.name="XYZ";
		nt1.salary=1500;
		nt1.incrementSalary();
		
	}
}