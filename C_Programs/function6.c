//B - function with parameters and returning nothing (void)
//7- wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) calculate and display the result.
//7- wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) 
//calculate and display the result.

#include<stdio.h>
void calculate(int n1,int n2 ,char op) 
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
	printf("\n res = %d",res);
}
int main() {
	int n1,n2;
	char op;
	printf("enter 2 no.");
	scanf("%d%d",&n1,&n2);
	printf("enter operator like +,-,*");
	fflush(stdin);
	scanf("%c",&op); 
	calculate(n1,n2,op);
	printf("\n exiting from main function");
	
}

