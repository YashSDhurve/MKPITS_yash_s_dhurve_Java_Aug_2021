#include<stdio.h>
#include<conio.h>
int main()
{
	// 3-  wap to accept 2 no and operator like +,- * and display the result.
	int num1,num2,result;
	char op;
	printf("enter 2 number");
	scanf("%d%d",&num1,&num2);
	printf("enter operater like +,-,*");
	fflush(stdin);
	scanf("%c",&op);
	if(op=='+'){
		result=num1+num2;
	}
	else if(op=='-'){
		result=num1-num2;
	}
	else if(op=='*'){
		result=num1*num2;
	}
	else{
	printf(" invalid operater");
}
	printf("\n result =%d",result);
}
