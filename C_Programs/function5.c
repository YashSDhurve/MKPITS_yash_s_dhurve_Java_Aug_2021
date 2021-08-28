//B - function with parameters and returning nothing (void)
//6 - wap to create a function sum with 2 int parameters and write code in it to add and display the addition of 2 no.
//wap to create a function sum with 2 int parameters and write code in it to add and 
//display the addition of 2 no.


#include<stdio.h>
void sum(int n1,int n2)
{
	int sum;
	sum=n1+n2;
	printf("\n addition of no.=%d",sum);
}
int main()
{
int num1,num2;
sum(num1=5,num2=7);
	printf("\n exiting from the main function");
}
