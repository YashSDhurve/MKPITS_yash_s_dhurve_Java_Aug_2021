#include<stdio.h>
//7 - wap to accept a no. and print table of that no. using for loop.
int main()
{
int num,i,table;
printf("enter a number");
scanf("%d",&num);
for(i=1;i<=10;i++)
{
	table=num*i;

printf("\n table=%d",table);
}
}
