#include<stdio.h>
#include<conio.h>
//11- wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) 
//calculate and return the result


int calculate(int n1,int n2,char op)
{
	int res;
	switch(op)
	{
		case '+':
			res=n1+n2;
			break;
		case '-':
			res=n1-n2;
			break;
		case '*':
			res=n1*n2;
			break;
		default:
		    printf("\n invalid operator");
			break;		
	}
	return res;
}

int main()
{
	int num1,num2,res;
	char op;
	printf("\n enter 2 no.");
	scanf("%d%d",&num1,&num2);
	printf("\n enter operator like+,-,*");
	fflush(stdin);
	scanf("%c",&op);
	//calling the result function
	res =calculate(num1,num2,op);
	printf("\n res=%d",res);
}
