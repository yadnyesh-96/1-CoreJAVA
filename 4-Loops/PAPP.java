// Example:  WAP to input number from keyboard and check number is perfect or not?



		while(i <= (num/2)){
			if(num%i==0){
				sum=sum+i;
			}
			i++;
			
		}
		String str = num==sum ? "Perfect number" : "Not perfect number";
		System.out.println(str);
	}
	
}