/* Q2. How Many Numbers Are Smaller Than the Current Number
	Input: nums = [8,1,2,2,3]
	Output: [4,0,1,1,3]
	*/
	
public class CompareNumber{
	public static void main(String x[]){
		int a[]=new int[]{6,5,4,8};
		int c[]=new int[a.length];
		int k=0;
		for(int i=0; i<a.length; i++){
			
			int count=0;
			for(int j=0; j<a.length; j++){
				if(a[i]>a[j]){
					count++;
					
				}
			}
			c[k++]=count;
		}
		
		System.out.print("\n[");
		for(int V:a){
			System.out.print(V+" ");
		}
		System.out.print("]\n");
		
		System.out.print("\n[");
		for(int V:c){
			System.out.print(V+" ");
		}
		System.out.print("]\n");
	}
}