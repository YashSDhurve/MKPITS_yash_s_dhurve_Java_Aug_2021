//2- continue :  continue statement will skip the remaining statement coming after continue statement inside loop and will continue to execute from next iteration.
//example of continue statement


#include<stdio.h>
int main()
{
	int num=0;
	
	while(num<=20)
	{
       num++;
	if(num==11){
		continue;
	}
		printf("\n num=%d",num);
	
}
	
	printf("\n out of while loop");

	}
