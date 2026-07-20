
import java.util.*;
class Student{
	int id;
	String name;
	int marks;
	
	Student(int id, String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	void setId(int id){
		this.id=id;
	}
	
	void setName(String name){
		this.name=name;
	}
	
	void setMarks(int marks){
		this.marks=marks;
	}
	
	int getId(){
		return id;
	}
	
	String getName(){
		return name;
	}
	
	int getMarks(){
		return marks;
	}
}

public class STDAPP{
	public static void main(String x[]){
		
		Vector<Student> v = new Vector<>();
		
		v.add(new Student(1,"Yash",50));
		v.add(new Student(2,"Amol",70));
		v.add(new Student(3,"Aayush",40));
		v.add(new Student(4,"Piyush",58));
		v.add(new Student(5,"Akash",65));
		
		
		
		//Display Student Records
		
		for(Student s : v){
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
		}
		
		int id = 3;
		boolean flag = false;
		
		for(Student k:v){
			if(k.getId()==id){
				System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks());
				flag=true;
			}
		}
		
		if(!flag){
			System.out.println("Record Not Found !");
		}
	}
}