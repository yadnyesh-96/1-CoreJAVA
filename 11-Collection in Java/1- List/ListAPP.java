import java.util.*;

public class ListAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		ArrayList L1=new ArrayList();
		
		
		for(int i=0; i<5; i++){
			int num=sc.nextInt();
			L1.add(num);
		}
		
		/*
		
		*/
		System.out.println("----------------");
		for(int i=0; i<5; i++){
		Object obj=L1.get(i);
		System.out.println(obj);
		}
		
		
	}

}