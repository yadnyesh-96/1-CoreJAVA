

public class FMAPP{
	public static void main(String x[]){
		
		int a[]=new int[]{10,30,20,40,50,60};
		
		int max_1=a[0];
		
		for(int i=0; i<a.length; i++){
			if(a[i]>max_1){
				max_1=a[i];
			}
		}
		
		int max_2=a[0];
		
		for(int i=0; i<a.length; i++){
			if(a[i]>max_2){
				if(a[i]==max_1){
					continue;
				}else{
					max_2=a[i];
				}
			}
		}
		
		System.out.println("1st Max is:"+max_1);
		System.out.println("2nd Max is:"+max_2);
		
	}
}