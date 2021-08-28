#include<stdio.h>
#include<conio.h>
//12 - wap to create a function factorial with one int parameter , calculate factorial and return the factorial.


int factorial(int n1)
{
	  int fact=1;
	while(n1>0)
	{
  
    fact=fact*n1;
    n1--;
}
	return fact;
}

int main()
{
	int num1,result;
	printf("\n enter  no.");
	scanf("%d",&num1);
	
	//calling the result function
	result = factorial(num1);
	printf("\n factorial=%d",result);
}
