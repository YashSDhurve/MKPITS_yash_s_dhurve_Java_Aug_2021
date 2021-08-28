//1- wap to accept 2 no. and display the greater no.
#include<stdio.h>
int main()
{
int num1,num2;
printf("enter number");
scanf("%d%d",&num1,&num2);
if(num1>num2)
{
	printf("\n num1 is greater");
}
else if(num1<num2)
{
	printf("\n num2 is greater");
}
}
