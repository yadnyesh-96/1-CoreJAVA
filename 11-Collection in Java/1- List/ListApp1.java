import java.util.*;

public class ListApp1{
	public static void main(String x[]){
		
		ArrayList l1=new ArrayList();
        
        l1.add(10);
        l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		int index=l1.indexOf(20);
		
		if(index!=-1){
			System.out.println("Value Founded");
		}else{
			System.out.println("Value note Found");
		}
        
		/*
        Iterator i=l1.iterator();
        while(i.hasNext()){
            Object obj=i.next();
            System.out.println(obj);
        }
		*/
		
		/*000
		l1.set(1,30);
		l1.add(80);
		//Object obj=l1.get(1);
		//System.out.println(obj);
		
		System.out.println(l1.get(1));
		//l1.remove(2);
		
		
		Object obj=l1.get(2);
		//System.out.println(obj);
		*/
		
		
	}
}