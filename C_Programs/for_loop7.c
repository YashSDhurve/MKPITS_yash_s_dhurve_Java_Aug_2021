#include<stdio.h>
//8 -wap to accept a no. and print whether it is a prime no. or not.
int main()
{
int num,i,res;
printf("enter a number");
scanf("%d",&num);
for(i=2;i<num;i++)
{
if(num%i ==0)
{
	printf("\n it is not a prime number");
	break;
}
	if(num==i);
	printf("\n it is a prime no");
	break;
}
}

