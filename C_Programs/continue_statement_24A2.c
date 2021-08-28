//example of goto statement
#include<stdio.h>

int main()

{
int n1,n2,res;
char op;
printf("enter to numbers");
scanf("%d%d",&n1,&n2);
fflush(stdin);
printf("enter operator like +,-,*");
scanf("op=%c",&op);
if(op=='+')
{
	goto add;
}
add:
	printf("\n add");
	goto end;
sub:
	printf("\n sub");
	goto end;
mul:
	printf("\n mul");
	goto end;
end:
	printf("\n bye");		
}
