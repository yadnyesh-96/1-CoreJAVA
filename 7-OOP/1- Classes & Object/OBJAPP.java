
class CAL{
	int a,b;
	void setValue(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void getProduct(){
		System.out.println("Product is:"+(a*b));
	}
}

public class OBJAPP{
	public static void main(String... x){
		CAL c=new CAL();
		c.setValue(10,20);
		c.getProduct();
		CAL c1=c;
		c1.setValue(5,4);
		c1.getProduct();
	}
}