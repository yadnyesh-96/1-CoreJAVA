/*
Q10. Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop.

*/

class Frequency{
	int a[];
	void inputArray(int arr[]){
		a=arr;
	}
	
	void countFrequency(){
		boolean visit[]=new boolean[a.length];
		
		for(int i=0; i<a.length; i++){
			if(visit[i]==true){
				continue;
			}
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
				count++;
					visit[j]=true;
					
				}
				
			}
			
			System.out.printf("%d is --> %d\n",a[i],count);
			
			
		}
	}

}

public class countFrequency{
	public static void main(String x[]){
		int m[]=new int[]{10,20,10,50,10,20};
		
		Frequency f1=new Frequency();
		
		f1.inputArray(m);
		f1.countFrequency();
	}
}