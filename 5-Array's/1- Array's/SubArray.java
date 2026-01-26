

public class SubArray{
	public static void main(String x[]){
		
		int a[]=new int[]{3,4,-7,1,3,3,1,-4};
		
		for(int i=0; i<a.length; i++){
			
			int sum=0;
			
			for(int j=i; j<a.length; j++){
					
				sum+=a[j];
				if(sum==7){
					System.out.print("["+i+".."+j+"] --> {");
					for(int k=i; k<=j; k++){
						System.out.print(a[k]+" ");
					}						
					System.out.println("}");
				}
			}
		}
	}
}