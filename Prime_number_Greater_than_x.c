/*Given a number X, find the smallest prime number which is grater than X*/

#include<stdio.h>
int main(){
	long i=0,j=0,num=0, count=0;
	printf("Enter the number = ");
	scanf("%d", &num);
	for(i=2;1;i++){
		count=0;
		for(j=2;j<i;j++){
			if(i%j==0){count++;}
		}
		if(count==0 && i> num){ 
		printf("%d ",i);
		break;
		}
		
	}
	
}
