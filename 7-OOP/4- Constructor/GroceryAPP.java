/*
Q4. Problem:
 Create a class Product with fields id, name, and price.
 Implement:
	A parameterized constructor to initialize product details.
	A copy constructor to copy data from another object.
	Display both objects to confirm the copy works.
	Hint:
	Use Product(Product p) to copy fields.
 Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
*/

class Product{
	
	private int id;
	private String name;
	private double price;
	
	//parameterized constructor
	
	Product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	//setters
	void setId(int id){ this.id=id;}
	void setName(String name){ this.name=name;}
	void setPrice(double price){ this.price=price;}
	
	//copy constructor
	
	Product(Product p){
		this.id=p.id;
		this.name=p.name;
		this.price=p.price;
	}
	
	void Display(){
		System.out.println("-- Product Details --");
		System.out.println("Id 	 :"+id);
		System.out.println("Product Name :"+name);
		System.out.println("Product Price:"+price);
	}
			
}

public class GroceryAPP{
	public static void main(String x[]){
		
		Product p1=new Product(01,"Paneer",120);
		p1.Display();
		
		Product p2=new Product(p1);
		p2.Display();
		
		p2.setId(02);
		p2.setName("Rice");
		p2.setPrice(180);
		
		p2.Display();
		
	}
}