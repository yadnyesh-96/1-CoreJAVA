/*
Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage(int arr[])
Logic: Use sum ÷ total elements.

		
		return sum/a.length;
	
	}
}

public class ArrayAverage{
	public static void main(String x[]){
		
		int m[]=new int[]{1,2,3,4,5,6};
		
		Average a1=new Average();
		
		a1.inputArray(m);
		System.out.println(a1.findAverage());
	}
}