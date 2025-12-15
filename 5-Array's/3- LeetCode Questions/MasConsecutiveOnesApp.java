// Q3. Max Consecutive Ones

public class MasConsecutiveOnesApp{
	public static void main(String x[]){
		
		int a[]=new int[]{1,1,0,1,1,1};
		
		System.out.print("\n[");
		for(int V:a){
			System.out.print(V+" ");
		}
		System.out.print("]\n");
		
		int count=0,max1=0;
		for(int i=0; i<a.length; i++){
			
			if(a[i]>0){
				count++;
				if(count>max1){
					max1=count;
				}
			}else{
				count=0;
				
			}
			
			
			
			
		}
		
		System.out.println("Max Consecutive 1's:"+max1);
	}
}