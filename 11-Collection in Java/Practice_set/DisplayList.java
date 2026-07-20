

import java.util.*;
public class DisplayList{
	
	public static void main(String x[]){
		
		ArrayList<Integer> ls = new ArrayList<>();
		
		
		ls.add(50);
		ls.add(40);
		ls.add(20);
		ls.add(70);
		ls.add(90);
		ls.add(80);
		
		int len = ls.size();
		
		int first_max = 0;
		int second_max = 0;
		
		System.out.println("Display List using For loop");
		
		for(int i=0; i<len; i++){
			int num = ls.get(i);
			
			if(num>first_max){
				second_max = first_max;
				first_max = num;
			}else if(num > second_max && num!=first_max){
				second_max = num;
			}
		}
		
		System.out.println("Second Max is:"+second_max);
		
		
		System.out.println("Display List in Forward:");
		ListIterator<Integer> i = ls.listIterator();
		while(i.hasNext()){
			int num = i.next();
			System.out.println(num);
		}
		
		System.out.println("Display List in Backward:");
		while(i.hasPrevious()){
			int num = i.previous();
			System.out.println(num);
		}
		
	}
}