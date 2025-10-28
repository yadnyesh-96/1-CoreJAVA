/*
Q9.Implement a program to calculate product discounts based on price using POJO class and a
separate service class for logic.
Requirements:
	1. POJO Class – Product
		• Fields (private):
			o int productId
			o String productName
			o double price
		• Methods:
			o Public getter and setter methods for each field.
		• Note: Do not use a constructor; values must be set using setters.
	2. Logic Class – ProductService
		• Method 1: calculateDiscount(Product p)
			o Calculates discount based on the product price:
		▪ Price ≥ 1000 → Discount = 20% of price
		▪ 500 ≤ Price < 1000 → Discount = 10% of price
		▪ Price < 500 → Discount = 5% of price
			o Returns the discount amount.
		• Method 2: displayProductDetails(Product p)
			o Displays:
		▪ Product ID
		▪ Product Name
		▪ Price
		▪ Calculated Discount
		▪ Final Price after discount (Price − Discount)
	3. Main Method Instructions:
		1. Create a Product object.
		2. Assign values to the object using setter methods.
		3. Use ProductService to:
	o Calculate discount using calculateDiscount().
	o Display product details using displayProductDetails().
*/

import java.util.*;
class Product{
	private int productId;
	private String productName;
	private double productprice;
	
	void setProductID(int productId){
		this.productId=productId;
	}
	
	int getProductID(){
		return productId;
	}
	
	void setProductName(Strin productName){
		this.productName=productName;
	}
	
	String getProductName(){
		return productName;
	}
	
	void setProductPrice(double productprice){
		this.productprice=productprice;
	}
	
	double getProducrPrice(){
		return productprice;
	}
}


class ProductService{

	
	/*
	• Method 1: calculateDiscount(Product p)
			o Calculates discount based on the product price:
		▪ Price ≥ 1000 → Discount = 20% of price
		▪ 500 ≤ Price < 1000 → Discount = 10% of price
		▪ Price < 500 → Discount = 5% of price
			o Returns the discount amount.
	*/
	
	double calculateDiscount( Product p){
		double price=p.getProducrPrice;
		double discount;
		
		if(price>=1000){
			discount=price*0.20;
		}else if(price>=500){
			discount=price*0.10;
		}else{
			discount=price*0.05;
		}
		
		return discount;
	}
	
	
	/*
	• Method 2: displayProductDetails(Product p)
			o Displays:
		▪ Product ID
		▪ Product Name
		▪ Price
		▪ Calculated Discount
		▪ Final Price after discount (Price − Discount)
	*/
	
	void displayProductDetails(){
		double discount=calculateDiscount(p);
		double finalPrice=p.getProducrPrice()-discount;
	
		System.out.println("\nProduct ID 				 :"+p.getProductID()+
						   "\nProduct Name 				 :"+p.getProductName()+
						   "\nPrice		                 :"+p.getProducrPrice()+
						   "\nCalculated Discount 		 :"+discount+
						   "\nFinal Price After" 
						   "\nDiscount(Price - Discount) :"+finalPrice);
	}
}

public class ProductBill{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the How many Products you hav ?:");
		int n=sc.nextInt();
		
		Product p[]=new Product[n];
		
		for(int i=0; i<p.length; i++){
			p[i]=new Product();
			
			p[i].setProductID
		}
	}
}