#include<stdio.h>
#include<conio.h>
//8 wap to create a function factorial with one int parameter ,
//calculate and display the factorial of that number.
void fact(int num1)
{
	int fact=1;
		while(num1>0)
	{
	fact=fact*num1;
	num1--;
}
		printf("\n fact=%d",fact);
	
	
}

int main()
{
	int n1;
	printf("\n enter a no.");
	scanf("%d",&n1);
	fact(n1);
	printf("\n exiting from the main function");
}
