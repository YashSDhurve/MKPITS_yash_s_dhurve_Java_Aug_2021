//2-example of continue statement
#include<stdio.h>

int main()

{
int num=0;
while(num<=15)
{
	num++;
	
	if(num==6)
	{
		continue;
	}printf("\n num=%d",num);
}
printf("\n out of while loop");
}
