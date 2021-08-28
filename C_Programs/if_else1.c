//2- wap to accept age from the user and display whether he is elegible to vote or not.
#include<stdio.h>
int main()
{
int age;
printf("enter age of a person");
scanf("%d",&age);
if(age>=18)
{
	printf("\n person is eligible to vote");
}
else if(age<18)
{
	printf("\n person is not eligible to vote");
}
}
