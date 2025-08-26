/*
Q4. Write a menu-driven program using switch and do-while to perform operations on a single number:
1.Count the number of digits
2.Count how many digits are even
3.Find the product of all odd digits
4.Check if the number is an Armstrong number
5.Exit the program

*/


import java.util.*;
public class NumFundamentalsApp{

	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number to perform the following opertation on there :");
	int num =sc.nextInt();
	int temp=num;
					
					System.out.println("----------------------------------------");
					System.out.println("1.Count the number of digits.");
					System.out.println("2.Count how many digits are even.");
					System.out.println("3.Find the product of all odd digits.");
					System.out.println("4.Check if the number is an Armstrong number.");
					System.out.println("5.Exit the program.");
					System.out.println("--------------------------------------------------");
	
	
				
					
					
					
					int count=0;
					int Ev=0;
					int odd=1;
					int rem=0;
					
					while(num!=0)
						{	++count;
								rem=num%10;
								if(rem%2==0){
									++Ev;
								}else{
									odd=odd*rem;
								}
								num=num/10;
								
							}
				do{			
					System.out.println("---------------------------------");
					System.out.println("Enter the select option: ");
					int choice= sc.nextInt();
					switch (choice){
						
						case 1: 
							System.out.println("----------------------------------");
							System.out.println("Count the Number in Digit");
							System.out.println("The Total Number of digit in the Number is: "+count);
						break;
							
						case 2 : 
							System.out.println("----------------------------------------");
							System.out.println("Count the how many digits are even in Input Number");
							System.out.println("Total Even digit in the number is : "+Ev);
						break;
						
						case 3:
							System.out.println("----------------------------------------");
							System.out.println("Product of all Odd digits");
							System.out.println("Product of all Odd digit in the number is : "+odd);
						break;
						
						case 4:
							System.out.println("---------------------------------");
							System.out.println("To checks the Number is Armstrong");
							num=temp;
							int add=0;
							while(num!=0){
								
								rem=num%10;
								add+=((int)Math.pow(rem,count));
								num=num/10;
								
							}
							System.out.println(add==temp? "---> Amastrong" : "----> Not Amastrong");
						break;
						
						case 5: System.out.println("Exit...."); System.exit(0); break;
						
					}	
				
				}while(true);
	
	}


}