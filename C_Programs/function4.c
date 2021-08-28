//B - function with parameters and returning nothing (void)
//5 - repeat the above program with accepting the no. from the user.
// wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.

#include<stdio.h>
void square(int num1)
{
	int square;
	square=num1*num1;
	printf("\n square of a number=%d",square);
	
}
int main()
{
	int n1;
	printf("\n enter a nmuber");
	scanf("%d",&n1);
	square(n1);
	printf("\n exiting from the main function");
}

