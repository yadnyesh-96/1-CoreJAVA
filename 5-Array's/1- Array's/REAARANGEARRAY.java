
public class REAARANGEARRAY{
	public static void main(String x[]){
		
		int a[]=new int[]{1,2,3,4,5,6};
		
		System.out.print("\n[");
		for(int V:a){
			System.out.print(" "+V);
		}
		System.out.print("]\n");
		
		int b[]=new int[a.length];
		int j=0,k=1;
		for(int i=0; i<b.length; i++){
			
			if(i%2==0){
				b[i]=a[k];
			}else{
				if((i%2!=0)&&(j%2==0)){
					b[i]=a[j];
				}
			}
		j++;
		k++;
			
		}
		
		System.out.print("\n[");
		for(int V:b){
			System.out.print(" "+V);
		}
		System.out.print("]\n");
	}
}