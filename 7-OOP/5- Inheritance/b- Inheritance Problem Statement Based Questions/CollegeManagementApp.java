
class Person{
	int id;
	String name,address,contactNo;
	
	
	//As per the mentioned question we use parameterized constructor here 
	
	Person(int id,String name, String address,String contactNo){
		
		this.id=id;
		this.contactNo=contactNo;
		this.name=name;
		this.address=address;
	}
	
	/*
	void addDetails(int id,String name, String address,String contactNo){
		
		this.id=id;
		this.contactNo=contactNo;
		this.name=name;
		this.address=address;
	}
	*/
	void displayDetails(){
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("contact No:"+contactNo);
	}
	
	void UpdateAddress(String address){
		this.address=address;
	}
	
	void UpdateContact(String contactNo){
		this.contactNo=contactNo;
	}
	
	void showBasicInfo(){
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Contact No :"+contactNo);
	}
	
}

class Student extends Person{
		
	String CourseName;
	int[] marks=new int[3];
	double percentage;
	
	Student(int id,String name, String address,String contactNo,String CourseName){
		super(id,name,address,contactNo);
		this.CourseName=CourseName;
	}
	
	void enterMarks(int[] marks){
		for(int i=0; i<marks.length; i++){
			this.marks[i]=marks[i];
		}
	}
	
	double calculatePercentage(){
		int sum=0;
		for(int i=0; i<marks.length; i++){
			sum+=marks[i];
		}
		
		 percentage=sum/3.0;
		return percentage;
	}
	
	
	void displayDetails(){
		super.displayDetails();
		System.out.println("Course Name :"+CourseName);
		System.out.println("Percentage :"+percentage+" %");
	}
}

class Faculty extends Person{
	String subject;
	double salary;
	int experience;
	
	Faculty(int id,String name, String address,String contactNo,double salary,int experience){
		super(id,name,address,contactNo);
		this.salary=salary;
		this.experience=experience;
	}
	
	void assignSubject(String subject){
		this.subject=subject;
	}
	
	
	void calculateIncrement(){
		if(experience>=5){
			salary+=salary*0.10;
		}	}
	
	void displayFacultyInfo(){
		super.displayDetails();
		System.out.println("Subject :"+subject);
		System.out.println("Updated Salary  :"+salary);
		System.out.println("Experience :"+experience);
	}
}

public class CollegeManagementApp{
	public static void main(String x[]){
		
		Student s1=new Student(1,"Aniket","Maharashtra","123456789","JAVA Programming");
		int[] marks={80, 85, 90};
		
		s1.enterMarks(marks);
		s1.calculatePercentage();
		s1.UpdateAddress("Ahilyanagar");
		s1.UpdateContact("987654321");
		s1.displayDetails();
		
		System.out.println("---------------------------");
		Faculty f1=new Faculty(2,"Vaibhav","Beed","852963741",15000,4);
		f1.assignSubject("Skill Development");
		f1.calculateIncrement();
		
		f1.displayFacultyInfo();
	}
}