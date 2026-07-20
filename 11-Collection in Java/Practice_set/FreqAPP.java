
import java.util.*;
public class FreqAPP{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		system.out.println("Enter Size of Array:");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter elements in Array:");
		for(int i=0; i<size; i++){
			int num = sc.nextInt();
			a[i]=num;
		}
		
		//int a[]=new int[]{10,20,30,40,10,20,30,50,60,70};
		
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(); 
		
		
		for(int i=0; i<a.length; i++){
			if(map.containsKey(a[i])){
				map.put(a[i],map.get(a[i])+1);
			}else{
				map.put(a[i],1);
			}
		}
		
		Set<Map.Entry<Integer,Integer>> data = map.entrySet();
		for(Map.Entry<Integer,Integer> e : data){
			if(e.getValue()>1){
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
		}
	}
}