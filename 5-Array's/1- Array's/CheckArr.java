
public class CheckArr{
	public static void main(String x[]){
		 int a[]=new int[]{1, 2, 2, 3, 4};
        
        int j=0;
        boolean flag=true;
        while(j<a.length-1){
            if(a[j]>a[j+1]){
                flag=false;
                break;
            }
			j++;
        }
        if(!flag){
            System.out.println(flag);
        }else{
            System.out.println(flag);
        }
	}
}	