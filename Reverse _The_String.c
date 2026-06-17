// Reverse the words in the sentence “have a nice day”. It should be 
changed to “day nice a have”.


#include<stdio.h>
#include<ctype.h>

int main(){
	char name[100]= "have a nice day";
	//char name[100]= "Hello from Sundaravaradhan A";
	int strlen;
	//printf("%s",name);
	
	// string lenght
	for (int i=0; name[i] != '\0'; i++){
		strlen++;
	}
	int end =strlen;
	//printf("%d", strlen);
	//printf("%c",name[strlen-1]); // show i
	for(int i=strlen;i>=0;i--){
		//printf("%c",name[i]);
		if(isspace((unsigned char)name[i])){
			name[i]='\0';
			
			printf("%s ",&name[i+1]);
		}
		
	}
	printf("%s\n",name);

	return 0;
	
}                                                                      
// OUTPUT
// day nice a have
