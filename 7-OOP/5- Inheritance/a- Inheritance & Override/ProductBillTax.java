/*
9. Question:
 Create base class Product with fields id, name, and basePrice.
 LuxuryProduct adds 20% tax.

 EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.

 Explanation:
 Tests inheritance where logic changes depending on product type.
*/

import java.util.*;
class Product{
	int id;
	String name;
	double price;

	Product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	void display(){
		System.out.println("~~~ Product Details ~~~");
		System.out.println("_______________________");
		System.out.println("Id :"+id);
		System.out.println("Name  :"+name);
		System.out.println("Price :"+price+" Rs.");
	}
	
	
	double addTax() {
        return 0.0;
    }
}

class LuxuryProduct extends Product{
	
	LuxuryProduct(int id,String name,double price){
		super(id,name,price);
	}
	
	double addTax(){
		
		return price * 0.20;
	}
	
	void display(){
		super.display();
		double tax = addTax();
        double total = price + tax;
		System.out.println("Tax Amount :"+tax);
		System.out.println("Total Price :"+total);
	}
}

class EssentialProduct extends Product{

	EssentialProduct(int id,String name,double price){
		super(id,name,price);
	}
	
	double addTax(){
		return price * 0.05;
	}
	
	void display(){
		super.display();
		double tax = addTax();
        double total = price + tax;
		System.out.println("Tax Amount :"+tax);
		System.out.println("Total Price :"+total);
	}
}

public class ProductBillTax{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		LuxuryProduct Lp1=new LuxuryProduct(01,"MAC-Book",54000);
		Lp1.display();
		
		System.out.println("---------------------\n \n");
		
		EssentialProduct Ep1=new EssentialProduct(001,"Intex-CPU",25000);
		Ep1.display();
	}

	
}	