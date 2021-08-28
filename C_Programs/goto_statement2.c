//3-wap to create a function square to accept  a no. and display the square of that no.
#include<stdio.h>
int square()
{
	int num,square;
	printf("\n enter number");
	scanf("%d",&num);
	square=num*num;
	printf("\nsquare= %d",square);
	scanf("%d",&square);
	
	
}
int main()
{
	square();
	printf("\n exiting from main function");
}
