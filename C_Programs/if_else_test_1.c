//1. Write a C program to accept two integers and check whether they are equal or not.
#include<stdio.h>
int main()
{
	int num1,num2;
	printf("enter 2 no");
	scanf("%d%d",&num1,&num2);
	if(num1-num2==0){
		printf("\n integers are equal");
	}
	else if(num1-num2!=0){
		printf("\n integers are not equal");
	}
	
}
