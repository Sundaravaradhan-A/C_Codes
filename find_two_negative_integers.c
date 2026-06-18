#include<stdio.h>
int main(){
	int i=0,arr[]={1,2,3,-4,5,-6},count=0;

//	printf("%d",i);

	for(i=0;i<6;i++){
		
		if( (arr[i]>> 31) & 1 ) count++;
		//printf("Count = %d \n",count);
		
		if (count==2)  {
		printf("Found two negative integers");
		break;}
		}
	
	return 0;
}
