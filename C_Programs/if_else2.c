//3 -  wap to accept 2 no and operator like +,- * and display the result.
#include<stdio.h>
int main()
{
int num1,num2,res;
char op;
printf("enter numbers");
scanf("%d%d",&num1,&num2);
printf("enter operator like +,-,*");
scanf("%c%c%c",&op);
fflush(stdin);
if(op=='+')
{
	res=num1+num2;
	printf("\n res=%d",res);
}
else if(op=='-')
{
		res=num1-num2;
	printf("\n res=%d",res);
	
}
if(op=='*')
{
		res=num1*num2;
	printf("\n res=%d",res);
	
}
}
