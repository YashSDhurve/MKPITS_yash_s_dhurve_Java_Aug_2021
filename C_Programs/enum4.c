//5- create a enum account having members saving,current and loan
#include<stdio.h>

enum account
{
	saving,current,loan
	
};
 
 int main()
 {
 	enum account ac;
 	ac=loan;
 	printf("\n account type = %d",ac);
 }
