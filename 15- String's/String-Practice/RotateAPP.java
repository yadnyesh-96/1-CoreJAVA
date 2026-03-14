

public class RotateAPP{
	
	public static void main(String x[]){
		
		int arr[]={1,2,3,4,5,6};
		int k=2;
		int n=arr.length;
		
		/*
		int res[] = new int[arr.length];
		int j=0;
		
		for(int i=k; i<arr.length; i++){
			res[j++]=arr[i];
		}	
		
		for(int i=0; i<k; i++){
			res[j++]=arr[i];
		}
		
		*/
		System.out.println();
		System.out.println("Actual Array:");
		for(int V:arr){System.out.print(V+" ");}
		
		rotateApp(arr,0,n-1);
		
		System.out.println();
		System.out.println("1st Operation: (arr,0,n-1)");
		for(int V:arr){System.out.print(V+" ");}
		
		rotateApp(arr,0,k-1);
		
		System.out.println();
		System.out.println("2nd Operation: (arr,0,k-1) ");
		for(int V:arr){System.out.print(V+" ");}
		
		rotateApp(arr,k,n-1);
		
		System.out.println();
		System.out.println("3rd Operation: (arr,k,n-1)");
		for(int V:arr){System.out.print(V+" ");}
	}
	
	public static void rotateApp(int a[],int start,int end){
		
		while(start<end){
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
	}
}