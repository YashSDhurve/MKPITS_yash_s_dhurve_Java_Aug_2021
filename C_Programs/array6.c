#include<stdio.h>
//6-wap to create long int array of 5 elements to store 5 long integer no. and accept 5 long integer no. from the user
//using for loop
// then display the long integer no. stored in long int array.
int main()
{
	int i;
	long int num[5];
	for(i=0;i<5;i++)
	{
	printf("\n enter number");
	scanf("\n %ld",&num[i]);
}
	for(i=0;i<5;i++)
	{
		printf("\n num=%ld",num[i]);
	}
		
}
