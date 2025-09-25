import java.util.*;

class Product{
	
	private int id,qty,rate;
	private String name,Company;
	
	
	public void setId(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCompany( String Company){
		this.Company=Company;
	}
	
	public String getCompany(){
		return Company;
	}
	
	public void setRate(int rate){
		this.rate=rate;
	}
	
	public int getRate(){
		return rate;
	}
	
	public void setQty(int qty){
		this.qty=qty;
	}
	
	public int getQty(){
		return qty;
	}
}

class Customer{
	
	private int id,mo;
	private String name, email, add;
	
	public void setId(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setMo(int mo){
		this.mo=mo;
	}
	
	public int getMo(){
		return mo;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setAddress(String add){
		this.add=add;
	}
	
	public String getAddress(){
		return add;
	}
}


class Shop{
	
	private Product Pros[];
	private Customer cs[];
	
	void inputProducts(Product ...pro){
		Pros=pro;
	}
	 
	void inputCustomer(Customer ...cmst){
		cs=cmst;
	}
	
	void DisplayBilling(){
		System.out.println();
		System.out.println();
		System.out.println("Customer Details:");
		System.out.println();
		
		for(int i=0; i<cs.length; i++){
		System.out.printf("Sr.%d  Customer Name :%s   Address :%s ",cs[i].getId(),cs[i].getName(),cs[i].getAddress());
		System.out.println();
		System.out.printf("Email:%s 	Contact:%d\n",cs[i].getEmail(),cs[i].getMo());
		
		}
		System.out.println("------------------------------------------------------------------------");
	}
	
	void DisplayPrList(){
		
		int total=0;
		int gTotal=0;
		System.out.println();
		System.out.println();
		System.out.println("You Entered Deatails:");
		System.out.println();
		System.out.printf("%-5s %-20s %-15s %-10s %-10s %-10s\n",
                          "ID", "Name", "Company", "Qty", "Rate","Total");
        System.out.println("------------------------------------------------------------------------");
		for(int i=0; i<Pros.length; i++){
		System.out.println();
		 total=(Pros[i].getQty()*Pros[i].getRate());
		System.out.printf("%-5s %-20s %-15s %-10s %-10s %-10s\n",Pros[i].getId(),Pros[i].getName(),Pros[i].getCompany(),Pros[i].getQty(),Pros[i].getRate(),total);
		 gTotal+=total;
		}
		System.out.println("------------------------------------------------------------------------");
		System.out.println(" 						   Grand Total = "+gTotal);
		
	}
	
	
}

public class BillingApplication{

	public static void main(String x[]){
	
		Shop s1=new Shop();
		
		Customer c1=new Customer();
			c1.setId(01);
			c1.setName("Ajinkya");
			c1.setEmail("ajinkya@gmail.com");
			c1.setMo(123456781);
			c1.setAddress("Pune Maharashtra");
		
		s1.inputCustomer(c1);
		s1.DisplayBilling();
		
		
			Product p1=new Product();
			 p1.setId(1);
			 p1.setName("Rice 5kg");
			 p1.setCompany("India Gate");
			 p1.setQty(2);
			 p1.setRate(500);
			 
			Product p2=new Product();
			 p2.setId(2);
			 p2.setName("Wheat Flour 10kg");
			 p2.setCompany("Aashirvaad");
			 p2.setQty(1);
			 p2.setRate(1200);
			 
			Product p3=new Product();
			 p3.setId(3);
			 p3.setName("Sunflower Oil 1L");
			 p3.setCompany("Fortune");
			 p3.setQty(1);
			 p3.setRate(650);

			Product p4=new Product();
			 p4.setId(4);
			 p4.setName("Sugar 1kg");
			 p4.setCompany("Madhur");
			 p4.setQty(1);
			 p4.setRate(120);
			
			Product p5=new Product();
			 p5.setId(5);
			 p5.setName("Tea Powder 500g");
			 p5.setCompany("Tata Tea");
			 p5.setQty(3);
			 p5.setRate(170);
			 
		
		s1.inputProducts(p1,p2,p3,p4,p5);
		s1.DisplayPrList();
		
		/*
		Customer c1=new Customer();
			c1.setId(01);
			c1.setName("Ajinkya");
			c1.setEmail("ajinkya@gmail.com");
			c1.setMo(123456781);
			c1.setAddress("Pune Maharashtra");
		
		s1.inputCustomer(c1);
		s1.DisplayBilling();
		*/
	}
}