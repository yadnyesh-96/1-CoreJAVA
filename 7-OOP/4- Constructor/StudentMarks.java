/*
Q2. Problem:
	Create a class Student with fields rollNo, name, m1, m2, m3, and total.
	Use a parameterized constructor to assign values to roll number, name, and marks.
	Calculate total marks inside the constructor and display details using a function.
	Hint: Constructor should perform addition logic.
	Explanation:
	Shows how to use constructors to initialize and process multiple fields at once.

*/

class Student{
	
	//Specifices the fields here
	
	private int rollNo,m1,m2,m3,total;
	private String StdName;
	
	// paramaterized constructor 
	Student(int rollNo,String StdName,int m1,int m2,int m3){
		this.rollNo=rollNo;
		this.StdName=StdName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.total=m1+m2+m3;
		
	}
	
	//Setters getters
	
	void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}
	
	int getRollNo(){
		return rollNo;
	}
	
	void setStudentName(String StdName){
		this.StdName=StdName;
	}
	
	String getStudentName(){
		return StdName;
	}
	
	void setM1(int m1){
		this.m1=m1;
	}
	
	int getM1(){
		return m1;
	}
	
	void setM2(int m2){
		this.m2=m2;
	}
	
	int getM2(){
		return m2;
	}
	
	void setM3(int m3){
		this.m3=m3;
	}
	
	int getM3(){
		return m3;
	}
	
	void setTotal(int total){
		this.total=total;
	}
	
	int getTotal(){
		return total;
	}
	
	void DisplayDetails(){
		
		System.out.println("Student Details and Marks");
		System.out.println("Roll No         :"+rollNo);
		System.out.println("Student Name	:"+StdName);
		System.out.println("Subject-1 Marks :"+m1);
		System.out.println("Subject-2 Marks :"+m2);
		System.out.println("Subject-3 Marks :"+m3);
		System.out.println("Total Marks 	:"+total);
	}
	
}

public class StudentMarks{
	public static void main(String x[]){
		
		Student s1=new Student(10,"ABC",10,20,30);
		s1.DisplayDetails();
	}
}