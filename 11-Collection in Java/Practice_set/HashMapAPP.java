
import java.util.*;

public class HashMapAPP{

	public static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }
	
	public static void main(String x[]){
		
		HashMap<String,Integer> map = new HashMap<>();
		
		ArrayList<String> al = new ArrayList<>();
			al.add("Java");
			al.add("Python");
			al.add("SQL");
			al.add("Code");
			al.add("Spring");
	
		for(String s : al){
			if(!map.containsKey(s)){
				map.put(s,s.length());
			}
		}
		
		Set<Map.Entry<String,Integer>> data = map.entrySet();
		for(Map.Entry<String,Integer> e : data){
			
				System.out.println(e.getKey()+"\t"+e.getValue());
			
		}
	}
}