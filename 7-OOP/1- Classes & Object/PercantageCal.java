class per{
	int sub[];
	
	void setMarks(int s[]){
	 sub=s;
	}
	
	int aggPer(){
		int sum=0;
		for(int i=0; i<sub.length; i++){
			sum+=sub[i];
		}
		return sum/sub.length;
	}

}

public class PercantageCal{
	public static void main(String x[]){
		per m1=new per();
		
		int Marks[]=new int[]{60,60,60,60,60,60};
		
		m1.setMarks(Marks);
		int res=m1.aggPer();
		System.out.println(res);
	}

}