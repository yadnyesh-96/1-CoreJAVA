#include<stdio.h>

int main(){
	int size;
	printf("Enter size of array:");
	scanf("%d",&size);
	
	int a[size];
	
	for(int i=0; i<size; i++){
		printf("%d=",i);
		scanf("%d",&a[i]);
	}
	
	
	
	for(int i=0; i<size; i++){
		for(int j=i+1; j<size; j++){
			if(a[i]>a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	printf("\n\n[");
	for(int i=0; i<size; i++){
		printf("%d, ",a[i]);
	}
	printf("]\n\n");
	
	return 0;
}