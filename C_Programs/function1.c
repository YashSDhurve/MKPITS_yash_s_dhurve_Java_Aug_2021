//- wap to create a function sum to accept 2 no. and display the addition of 2 no.
//creating a function sum

#include<stdio.h>
void sum()
{
	int n1,n2,res;
	printf("\n enter 2 no.");
	scanf("%d%d",&n1,&n2);
	res=n1+n2;
	printf("\n additon of 2 no.=%d",res);
	scanf("\n %d",&res);
}
int main()
{
	sum();
	printf("\n bye from the main function");
}
