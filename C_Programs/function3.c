 //3- wap to create a function square to accept  a no. and display the square of that no.
//creating a function sum


#include<stdio.h>
void square()
{

int num1,square;
printf("\n enter a number");
scanf("\n %d",&num1);
square=num1*num1;
printf("\n square of number=%d",square);
}
int main()
{
	square();
	printf("\n bye from the main function");
}
