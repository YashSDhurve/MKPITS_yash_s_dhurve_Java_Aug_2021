//6 wap to accept empno,firstname , lastname, designation and salary of the employee and display it.

#include<stdio.h>


int main()
{   
    int empno;
	char first_name[15];
	char last_name[20];
	char desig[20];
	int sal;
	
	printf("\n enter empno");
	scanf("%d",&empno);
	printf("\n enter first name--");
	fflush(stdin);
	gets(first_name);     
	puts(first_name);
	printf("\n enter last name--");
	gets(last_name);     
	puts(last_name);
	printf("\n  enter designation--");
	gets(desig);     
	puts(desig);
	printf("\n enter salary--");
	scanf("%d",&empno);

//diplaying the details of employee.
printf("\n employee details");

printf("\n employeeno.-- %d",empno);
printf("\n first_name-- %s",first_name);	
printf("\n last_name-- %s",last_name);
printf("\n designation--%s",desig);
printf("\n salary--%d",sal);			







	
}
