/*
Q1. Problem:
	Create a class Employee with fields:
	empId, empName, basicSalary, hra, da, and grossSalary.
	Use a parameterized constructor to initialize empId, empName, and basicSalary.
	HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
	Disp
 
class Employee{
	
	private int empId;
	private String empName;
	private double basicSalary,hra,da,grossSalary;
	
	Employee(int empId, String empName, double basicSalary){
		
		this.empId=empId;
		this.empName=empName;
		this.basicSalary=basicSalary;
		this.hra=0.10*basicSalary;
		this.da=0.15*basicSalary;
		this.grossSalary=basicSalary+hra+da;
	}
	
		void setEmpId(int empId){
			this.empId=empId;
		}
		
		int getEmpId(){
			return empId;
		}
		
		void setEmpName(String empName){
			this.empName=empName;
		}
		
		String getEmpName(){
			return empName;
		}
		
		void setBasicSalary(double basicSalary){
			this.basicSalary=basicSalary;
		}
		
		double getBasicSalary(){
			return basicSalary;
		}
		
		void setHRA(double hra){
			this.hra=hra;
		}
		
		double getHRA(){
			return hra;
		}
		
		void setDA(double da){
			this.da=da;
		}
		
		double getDA(){
			return da;
		}
		
		void setGrossSalary(double grossSalary){
			this.grossSalary=grossSalary;
		}
		
		double getGrossSalary(){
			return grossSalary;
		}
		
		void DisplayDetails(){
			/*
			System.out.println("-------Employee Detail's & Salary Slip -----"
							  +"\nEmployee Id   :"+empId
							  +"\nEmployee Name :"+empName
							  +"\nBasic Salary  :"+basicSalary
							  +"\nHRA ( 10% )	:"+hra
							  +"\nDA  ( 15% )	:"+da
							  +"\nGross Salary	:"+grossSalary);
							  */
		System.out.println("------ Employee Salary Slip ------");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("HRA (10%)        : " + hra);
        System.out.println("DA (15%)         : " + da);
        System.out.println("----------------------------------");
        System.out.println("Gross Salary     : " + grossSalary);
        System.out.println("----------------------------------");
		}

}

public class EmployeeSalary{
	
	public static void main(String x[]){
		
		Employee em=new Employee(01,"ABC",40000);
		em.DisplayDetails();
	}
}