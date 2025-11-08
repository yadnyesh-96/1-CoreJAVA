/*
4. Question:
 Create a class Student with fields name and marks. 
 Create subclass EngineeringStudent and MedicalStudent.
 If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.

*/

class Student{
	String name;
	int[] marks;
}

class EngineeringStudent extends Student{
	
	void SubResult(){
		int count=0;
		for(int i=0; i<marks.length; i++){
			if(marks[i]>=50){
				count++;
			}			
		}
		System.out.println("Student Name :"+name);
		System.out.print("Result :");
		System.out.println(count >= 1 ? "Pass with "+count+" subjects" : "Fails");
	}
}

class MedicalStudent extends Student{
	
	void SubResult(){
		int count=0;
		for(int i=0; i<marks.length; i++){
			if(marks[i]>=50){
				count++;
			}			
		}
		System.out.println("Student Name :"+name);
		System.out.print("Result :");
		System.out.println(count >= 1 ? "Pass with "+count+" subjects" : "Fails");
	}
	
}

public class Result{
	public static void main(String x[]){
	
		int[] marks1={40,0,30,20,35};
		
		EngineeringStudent e1=new EngineeringStudent();
		e1.name="Ajinkya";
		e1.marks=marks1;
		e1.SubResult();
		
		
		int[] marks2={50,40,60,40,50};
		MedicalStudent m1=new MedicalStudent();
		m1.name="Abhijit";
		m1.marks=marks2;
		m1.SubResult();
	}
}