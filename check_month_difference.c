/*To write a function which given two dates, checks whether the dates are 
exactly 1 month apart (e.g June 06 2011 & July 06 2011, Dec 15 2010 & 
Jan 15 2011), less than 1 month apart (e.g Mar 01 2011 & Mar 25 2011) */


#include<stdio.h>
#include<string.h>
typedef enum {
	Jan=1, Feb, Mar, Apr, May, June, July, Aug, Sep, Oct, Nov, Dec 
} months;

months string_to_enum(char *str) {
if (strcasecmp(str,"Jan")==0) return Jan;
   	 if (strcasecmp(str,"Feb")==0) return Feb;
if (strcasecmp(str,"Mar")==0) return Mar;
if (strcasecmp(str,"Apr")==0) return Apr;
    	if (strcasecmp(str,"May")==0) return May;
  	  if (strcasecmp(str,"June")==0) return June;
  if (strcasecmp(str,"July")==0) return July;
if (strcasecmp(str,"Aug") ==0) return Aug;
    if (strcasecmp(str,"Sep")== 0) return Sep;
  if (strcasecmp(str,"Oct")== 0) return Oct;
    if (strcasecmp(str,"Nov")== 0) return Nov;
if (strcasecmp(str,"Dec")==0) return Dec;
}

check_month_difference(char *month, int date, int year, char *month1, int date1, int year1){
	months temp= string_to_enum(month);
	months temp1= string_to_enum(month1);
	if(temp1 == temp + 1){
		if(year == year1){
			if(date == date1){
				printf("They are exactly at one month difference");
			}
			else if(date < date1){
				printf("Which is less than 1 month");
			}
			else{
				printf("Which is greather than 1 month");
			}
		}
		
	}

}

int main(){
	char month[10], month1[10];
	printf("%d",month);
	int date=0,year=0;
	int date1=0,year1=0;
	printf("Enter the details (June 06 2011 July 06 2011) : ");
	scanf("%9s %d %d %9s %d %d", month, &date ,&year, month1, &date1, &year1);
	
//	printf("%s %d %d",month+1,date,year);
	check_month_difference(month, date, year, month1, date1, year1);
	
}
