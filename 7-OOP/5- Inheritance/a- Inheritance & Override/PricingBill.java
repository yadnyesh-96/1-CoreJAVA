/*
3. Question:
 Create a base class Product with fields id, name, and price. 
 Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
 Explanation:
 This tests constructor chaining and method overriding for price calculation.
 */
 
class Product{

	int id;
	String name;
	double price;
		
	Product(int id, String name, double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

class Electronics extends Product{
		
	public Electronics(int id,String name,double price){
		super(id, name , price);
	}
	
	void Displayitems(){
		double discount=price*0.10;
		
		System.out.println("Id : "+id);
		System.out.println("Item Name :"+name);
		System.out.println("Price :"+price+" Rs.");
		System.out.println("Total Price 10% discount :"+(price-discount)+" Rs.");
	}
}

class clothing extends Product{
	public clothing(int id,String name,double price){
		super(id,name,price);
	}
	
	void DisplayClothing(){
		
		double discount = price*0.20;
		
		System.out.println("Id :"+id);
		System.out.println("Item Name :"+name);
		System.out.println("Price :"+price+" Rs");
		System.out.println("Total Price 20% discount :"+(price-discount)+ "Rs.");
	}
}

public class PricingBill{
	public static void main(String x[]){
		Electronics E1=new Electronics(1,"Mouse",1500);
		E1.Displayitems();
		
		clothing C1=new clothing(01,"Shirt",450);
		C1.DisplayClothing();
	}
}