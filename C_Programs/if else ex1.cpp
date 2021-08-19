#include<stdio.h>
#include<conio.h>
int main()
{
	int num1, num2;
	int res = 0;
	char op;
	printf("enter 2 no.");
    scanf("%d%d",&num1, &num2);
    printf("enter operator like +,-,*");
	fflush(stdin);
	scanf("%c", &op);
	if(op=='+'){
	    result =num1+num2;
	}
	elseif(op=='-' ){
		result = num1 - num2;
	}
	elseif(op=='*'){
		result = num1 * num2;
	}
	else{
		printf(" invalid operator")
	}
	PRINTF("/N result =%C",result);
	
			
		
		
		
	
		
}

