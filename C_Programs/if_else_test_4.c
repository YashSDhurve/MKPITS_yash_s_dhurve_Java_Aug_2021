//5- Write a C program to read the age of a candidate and determine whether it is eligible for casting his/her own vote

#include<stdio.h>
int main()
{
int age;
printf("enter a age of candidate");
scanf("\n %d",&age);

if(age>=18)
{
	printf("he/she is eligible to vote");
	}	
	if(age<18)
	{
		printf("he/she is not eligible to vote");
	}
}
