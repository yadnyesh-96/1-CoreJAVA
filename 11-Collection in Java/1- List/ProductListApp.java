

import java.util.*;
class Product{
	private int id;
	private String name;
	private double price;
	
	Product(){
	}
	Product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public void setID(int id){ this.id=id;}
	public int getID(){ return id;}
	
	public void setName(String name){ this.name=name;}
	public String getName(){ return name;}
	
	public void setPrice(double price){ this.price=price; }
	public double getPrice(){ return price;}
	
}

public class ProductListApp{
	public static void main(String x[]){
		
		Vector v=new Vector();
		/*
		v.add(new Product(1,"Lassi",50));
		v.add(new Product(2,"Juice",40));
		v.add(new Product(3,"Pizza",80));
		v.add(new Product(4,"Burger",90));
		v.add(new Product(5,"Poha",20));
		v.add(new Product(6,"Pav-Bhaji",80));
		v.add(new Product(7,"Pulaw",70));
		v.add(new Product(8,"dosa",60));
		v.add(new Product(9,"Tea",15));
		v.add(new Product(10,"Bread",20));
		
		System.out.println("ID\tProducts\tPrice");
		System.out.println("---------------------------------");
		/*for(Object obj:v){
			
			Product p=(Product) obj; //down Casting
			System.out.println(p.getID()+"\t"+p.getName()+"\t\t"+p.getPrice());
				
		}
		*/
		
		v.add("Yadnyesh");
		v.add("Kailas");
		v.add("dhanagar");
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		System.out.println(v);
	}
}