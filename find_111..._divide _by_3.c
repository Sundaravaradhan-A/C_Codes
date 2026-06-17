/* 3 divides 111, 13 divides 111111 etc.. find a number having all one's 
which is shortest divisible by a given number which has 3 as its last digit.*/

#include<stdio.h>

int main(){
	int num,i=0;
	int val=1;
	printf("Enter the value = ");
	scanf("%d",&num);
	for(i=0;1;i++){
		if(val%num == 0){
		//printf("%d", val);
		for (int j=0;j<=i;j++){
            	printf("1");
            }
        printf("\n");    
		break;
		}
		else{
			val*=10;
			val++;
			//printf(" %d ",val);
			val= val%num;
			//printf(" %d ",val);
		}
	}
		
}
