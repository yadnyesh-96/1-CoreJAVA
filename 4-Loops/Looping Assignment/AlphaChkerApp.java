/*
Q3.Write a menu-driven program using switch and do-while to perform operations on a single character:
1.Check if the character is an alphabet.
2.If alphabet, check vowel or consonant.
3.If digit, check even or odd.
4.Convert uppercase to lowercase or vice versa.
5.Exit the program
*/

import java.util.*;
public class AlphaChkerApp{
	
		public static void main(String x[]){
		Scanner sc=new Scanner(System.in);		
			System.out.println("Enter the Input from keyboard: ");
			String ch=sc.nextLine();
			 System.out.println("-----------------------------------------");
				
				
					do{
						System.out.println("-----------------------------------------");
						System.out.println("1.Check if the character is an alphabet.");
				        System.out.println("2.If alphabet, check vowel or consonant.");
				        System.out.println("3.If digit, check even or odd.");
						System.out.println("4.Convert uppercase to lowercase or vice versa.");
				        System.out.println("5.Exit the program.");
						 System.out.println("-----------------------------------------");
						
						System.out.println("Slect the Option:");
						int choice=sc.nextInt();
						
						int a = ch.charAt(0);
						int b = ch;
						switch (choice){
									
								case 1:
									 System.out.println("-----------------------------------------");
									if(((a>=65)&&(a<=90))||((a>=97)&&(a<=122))){
										System.out.println("Input is Alphabates");
										 System.out.println("-----------------------------------------");
									}else if(ch.charAt(0)>=0 || ch.charAt(0)<=9){
										System.out.println("Input is digit");
										 System.out.println("-----------------------------------------");
									}else{
									System.out.println("Input is Invalid");
									 System.out.println("-----------------------------------------");
											continue;
									}
									
								break;
								
								case 2:
								 System.out.println("-----------------------------------------");
									if(ch.charAt(0)=='A'||ch.charAt(0)=='a'||ch.charAt(0)=='E'||ch.charAt(0)=='e'||ch.charAt(0)=='I'||ch.charAt(0)=='i'||ch.charAt(0)=='O'||ch.charAt(0)=='o'||ch.charAt(0)=='U'||ch.charAt(0)=='u'){
											System.out.println("Alphabate is the vowel");
											 System.out.println("-----------------------------------------");
											
									}else{
											System.out.println("Constatnt");
											 System.out.println("-----------------------------------------");
									}
								break;
								
								case 3:
									 System.out.println("-----------------------------------------");
									if(b>=0 || b<=9){
										System.out.println("Input is digit");
										 System.out.println("-----------------------------------------");
										if(b%2==0){
											System.out.println("digit is Even");
											 System.out.println("-----------------------------------------");
										}else{
											System.out.println("digit is Odd");
											 System.out.println("-----------------------------------------");
										}
									}
								break;	
								
								case 4:
									 System.out.println("-----------------------------------------");
									if((a>=65)&&(a<=90)){
										System.out.println("Uppercase");
										ch=(char)((int)ch.charAt(0)+32);
										System.out.println(ch+"conver in Lowercase: "+ch.charAt(0));
										 System.out.println("-----------------------------------------");
									}else if((a>=97)&&(a<=122)){
										System.out.println("Lowercase");
										ch=(char)((int)ch.charAt(0)-32);
										System.out.println(ch+"conver in Uppercase: "+ch.charAt(0));
										 System.out.println("-----------------------------------------");
									}
								break;
								
								case 5:
								 System.out.println("-----------------------------------------");
									System.out.println("Exit....!");
									System.exit(0);
									break;
								
								default:
								 System.out.println("-----------------------------------------");
									System.out.println("Invalid Input");
									
									continue;
							
							
						}
						
					}while(true);	
		
		}

}