/*
2. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.
*/
import java.util.*;
class Employee{
	private int id,sal,incr;
	private String name,dpt;
	
	public void setIncrement(int incr){
		this.incr=incr;
	}
	
	public int getIncrement(){
			return incr;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setSal(int sal){
		this.sal=sal;
	}
	
	public int getSal(){
		return sal;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setDpt(String dpt){
		this.dpt=dpt;
	}
	
	public String getDpt(){
		return dpt;
	}
	
}


class Interface{
		
		private Employee emptd[];
		
		public void inputEmpDetails(Employee ...em){
			emptd=em;
		}
		
		public void DisplayDetails(){
			System.out.println();
			
		System.out.println("|>Details of Emplyee's:");
			System.out.println();
			
			for(int i=0; i<emptd.length; i++){
				 
				 // ex. we have to add 10% in 5000 --> 10/100=0.10 --> 0.10*5000=500 --> 500+5000=5500 here this the additon of 10% in 5000
				float prc=(emptd[i].getIncrement()/100f); //10/100=0.10 -->0
				float fIncremnt=(prc*emptd[i].getSal())+emptd[i].getSal();
				System.out.println(" Id:"+emptd[i].getId()+"\n Name:"+emptd[i].getName()+"\n Salary:"+emptd[i].getSal()+"\n Increment: "+emptd[i].getIncrement()+"\n After the Increment:"+fIncremnt+"\n Department: "+emptd[i].getDpt());
			}
		}
}

public class EmpSalIncrement{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		Interface s1=new Interface();
		
			Employee e1[]=new Employee[2];
			
			for(int i=0; i<e1.length; i++){
				  e1[i]=new Employee();
				  
				  
				  
				  System.out.println("Enter the Name of Employee:");
				
				  String n=sc.next();
				  
				  System.out.println("Enter the Salary:");
				  int s=sc.nextInt();
				  
				  System.out.println("Enter the Increment (in integer) :");
				  int In=sc.nextInt();
				  
				  System.out.println("Department");
				  
				  String d=sc.next();
				  
				  e1[i].setId(i+1);
				  e1[i].setName(n);
				  e1[i].setSal(s);
				  e1[i].setIncrement(In);
				  e1[i].setDpt(d);
				  
				s1.inputEmpDetails(e1[i]);
				
			}
				
				s1.DisplayDetails();
			
			
		
	}
}