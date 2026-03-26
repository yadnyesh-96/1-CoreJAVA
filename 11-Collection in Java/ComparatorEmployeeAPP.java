
import java.util.Comparator;
import java.util.*;
class Employee implements{
	int id;
	int sal;
	String name;
	
	Employee(int id, int sal,String name){
		this.id = id;
		this.sal=sal;
		this.name=name;
	}
	
	void setSal(int sal){
		this.sal=sal;
	}
	
	int getSal(){
		return sal;
	}
	void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return name;
	}
	
	void setId(int id){
		this.id =id;
	}
	
	int getId(){
		return id;
	}
	
}

public class sortById implements Comparator{
	public int compare(Object obj1,Object obj2){
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		
		if(e1>e2){
			return 1;
		}else if(e1<e2){
			return -1;
		}else{
			return 0;
		}	
	}	
}

public class sortBySal implements Comparator{
	
	public int compare(Object obj1,Object obj2){
		Employee e1 = (Employee) obj1;
		Employee e2 = (Employee) obj2;
		
		if(e1>e2){
			return 1;
		}else if(e1<e2){
			return -1;
		}else{
			return 0;
		}
	}
}

public class ComparatorEmployeeAPP{
	public static void main(String x[]){
		
		List ls =new ArrayList();
		
		ls.add(new Employee(12,1450,"Ajay"));
		ls.add(new Employee(14,1200,"Vijay"));
		ls.add(new Employee(13,1600,"Vikrant"));
		ls.add(new Employee(11,1100,"Suresh"));
		
		
		Iterator i = ls.listIterator();
		
		while(i.hasNext()){
			Employee e = (Employee)i.next();
			System.out.println(e.getId()+" "+e.getName()+"  "+e.getSal());
		}
		
		System.out.println("After the Sorting :");
		Comparator c = new sortById();
		Collections(ls,c);
		
		Iterator r = ls.listIterator();
		while(r.hasNext()){
			Employee e = (Employee)r.next();
			System.out.println(e.getId()+" "+e.getName()+"  "+e.getSal());
		}
	}
}